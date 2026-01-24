package org.gevernova.JavaEightFeatures.UserRegistration;

/**
 * Functional interface for validating user credentials.
 *
 * @param <T> Type of input data required for validation (e.g., User object, String, etc.)
 * @param <R> Type of result returned after validation (e.g., Boolean, String, ValidationResult)
 */
public interface UserValidation<T, R> {

    /**
     * Validates user credentials based on provided input.
     *
     * @param t Input data to be validated
     * @return Validation result
     */
    R ValidateUserCredentials(T t);
}
