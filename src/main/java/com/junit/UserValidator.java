package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    // Constants
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^([a-zA-z0-9-_+.]+)" +
            "@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$";
    private static final String MOBILE_NUMBER = "^[91]{2}[\\s][0-9]{10}$";
    private static final String PASSWORD = "^[a-z(?=.*A-Z)(?=.*0-9)(?=.*@#$%^&+=)]{8,}$";


    public static void main(String[] args) {
        System.out.println("Welcome To The Program");
    }

    /**
     * Purpose : To Validate First Name Of User
     * @param fname This is the parameter to store first name of user
     * @return matcher value
     */
    public boolean validFirstName(String fname) throws UserRegistrationException {
        try {
            if (fname.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "First name can not be empty");
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            return pattern.matcher(fname).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "First name cannot be null");
        }
    }

    /**
     * Purpose : To Validate Last Name Of User
     * @param lname This is the parameter to store last name of user
     * @return matcher value
     */
    public boolean validateLastName(String lname) throws UserRegistrationException {
        try {
            if (lname.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Last name can not be empty");
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            return pattern.matcher(lname).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Last name cannot be null");
        }
    }

    /**
     * Purpose : To Validate The Email Address Of User
     * @param mail This is the parameter to store email address of user
     * @return matcher value
     */
    public boolean validateEmailAddress(String mail) throws UserRegistrationException {
        try {
            if (mail.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "E-Mail address can not be empty");
            Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
            return pattern.matcher(mail).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "E-Mail address can not be null");
        }
    }

    /**
     * Purpose : To Validate The Mobile Number Of User
     * @param phoneNumber This is the parameter to store mobile number of user
     * @return matcher value
     */
    public boolean validateMobileNumber(String phoneNumber) throws UserRegistrationException {
        try {
            if (phoneNumber.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Mobile number can not be empty");
            Pattern pattern = Pattern.compile(MOBILE_NUMBER);
            return pattern.matcher(phoneNumber).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Mobile number can not be null");
        }
    }

    /**
     * Purpose : To Validate The Password Of User
     * @param password This is the parameter to store password of user
     * @return matcher value
     */
    public boolean validatePassword(String password) throws UserRegistrationException {
        try {
            if (password.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Password can not be empty");
            Pattern pattern = Pattern.compile(PASSWORD);
            return pattern.matcher(password).matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Password can not be null");
        }
    }
}
