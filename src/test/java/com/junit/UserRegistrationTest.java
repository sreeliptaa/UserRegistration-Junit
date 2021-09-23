package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validFirstName("Sreelipta");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validFirstName("sree");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validFirstName("Sr@li");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateLastName("Sahoo");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateLastName("Sa");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenWithNumberOrSpecialCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateLastName("sa$hoo");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenStartingWithSmallLetter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateLastName("sahoo");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = true;
        try {
            result = validator.validateEmailAddress("sreelipta65@gmail.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenUserNameIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("@gmail.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenDomainNameIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("sree34@.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenMainTldIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("sreli56gmail");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenAtTheRateIsMissing_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("panja370gmail.com");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenWithOptionalTld_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateEmailAddress("panja370@gmail.co.in");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("91 8910211371");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("8910211371");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenSpaceIsMissingAfterCountryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("918910211371");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateMobileNumber("91 891021");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validatePassword("Sudip@2201");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validatePassword("Sudip12");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneUpperCase_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validatePassword("sudip@2201");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneNumericNumber_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validatePassword("Sudip#panja");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenWithAtLeastOneSpecialCharacters_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validatePassword("Sudip2201");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNull_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validFirstName(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenFirstName_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validFirstName("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenLastName_WhenNull_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validateLastName(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenLastName_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validateLastName("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenEmailAddress_WhenNull_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validateEmailAddress(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenEmailAddress_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validateEmailAddress("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenMobileNumber_WhenNull_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validateMobileNumber(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenMobileNumber_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validateMobileNumber("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    void givenPassword_WhenNull_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validatePassword(null);
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenPassword_WhenEmpty_ShouldThrow_UserRegistrationException() {
        UserValidator validator = new UserValidator();
        try {
            validator.validatePassword("");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}

