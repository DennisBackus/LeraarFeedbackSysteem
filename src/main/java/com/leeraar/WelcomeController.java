//package gbrother;
//
//		import org.springframework.beans.factory.annotation.Value;
//		import org.springframework.boot.autoconfigure.web.ErrorController;
//		import org.springframework.stereotype.Controller;
//		import org.springframework.web.bind.annotation.RequestMapping;
//		import org.springframework.web.bind.annotation.RestController;
//
//		import java.util.Map;
//
//@RestController
//public class WelcomeController implements ErrorController {
//
//	// inject via application.properties
//	@Value("${welcome.message:test}")
//	private String message = "Hello World";
//
//	@RequestMapping("/")
//	public String welcome(Map<String, Object> model) {
//		model.put("message", this.message);
//		return "welcome";
//	}
//
//	@RequestMapping("/error")
//	public String error() {
//		return "Error handling";
//	}
//
//	@Override
//	public String getErrorPath() {
//		return "/error";
//	}
//
//}