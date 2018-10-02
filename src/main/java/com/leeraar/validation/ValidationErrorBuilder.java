package com.leeraar.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

/**
 * Exception validation error builder for convert exception to ValidationError model.
 */
public class ValidationErrorBuilder {

    public static ValidationError fromBindingErrors(Errors errors) {
        ValidationError error = new ValidationError("Validation failed. " + errors.getErrorCount() + " error(s)");
        for (FieldError fieldError : errors.getFieldErrors()) {
            Map<String, String> errorDescriptionMap = new HashMap<>();

            errorDescriptionMap.put("about", fieldError.getField());
            errorDescriptionMap.put("errorMessage", fieldError.getDefaultMessage());
            error.addValidationError(errorDescriptionMap);
        }
        return error;
    }

    public static ValidationError fromExceptionError(String about, String errorMessage) {
        ValidationError errors = new ValidationError("");
        Map<String, String> errorDescriptionMap = new HashMap<>();

        errorDescriptionMap.put("about", about);
        errorDescriptionMap.put("errorMessage", errorMessage);
        errors.addValidationError(errorDescriptionMap);
        return errors;
    }

}
