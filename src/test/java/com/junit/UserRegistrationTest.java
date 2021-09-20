package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validFirstName("Sreelipta");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validFirstName("sree");
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validFirstName("Sr@li");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Sahoo");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Sa");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Pa#nja");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenStartingWithSmallLetter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("sahoo");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("sreelipta65@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenUserNameIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenDomainNameIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("sree34@.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenMainTldIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("sreli56gmail");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenAtTheRateIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("sahoo77gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenWithOptionalTld_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("sreelipta65@gmail.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 8956432896");
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("6875763210");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenSpaceIsMissingAfterCountryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("915669846885");
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 7553789");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Sreeli@1996");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("lisas32");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneUpperCase_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Srsahoo@1500");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneNumericNumber_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Sreelipt@59");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneSpecialCharacters_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Sree@876");
        Assertions.assertTrue(result);
    }

}

