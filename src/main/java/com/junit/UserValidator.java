package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    /**
     * Purpose : To Validate First Name Of User
     * @param fname This is the parameter to store first name of user
     * @return matcher value
     */
    public boolean validFirstName(String fname) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        // Returns false if user does not enter any name.
        if (fname.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(fname);
        return matcher.matches();

    }

    /**
     * Purpose : To Validate Last Name Of User
     * @param lname This is the parameter to store last name of user
     * @return matcher value
     */
    public boolean validateLastName(String lname) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lname);
        return matcher.matches();
    }

    /**
     * Purpose : To Validate The Email Address Of User
     * @param mail This is the parameter to store email address of user
     * @return matcher value
     */
    public boolean validateEmailAddress(String mail) {
        String regex = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }

    /**
     * Purpose: Boolean method to validate user's mobile number.
     * Condition 1: Mobile number should start with 91
     * Condition 2: Mobile number should have 10 numbers.
     * @param mobileNumber: mobile number to validate.
     * @return matcher value
     */
    public boolean validateMobileNumber(String mobileNumber) {
        // Space is not used, as console wont accept space.
        String regex = "^(91)[\\s][0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    /**
     * Purpose: Boolean method to validate user's password.
     * Rule 1: Password should have minimum 8 characters.
     * Rule 2: Password should have at least one upper-case.
     * Rule 3: Password should have at least one numeric value.
     * Rule 4: Password should have only one special character.
     * @param password: Password to validate.
     * @return matcher value
     */
    public boolean validatePassword(String password) {
        String regex = ("^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

