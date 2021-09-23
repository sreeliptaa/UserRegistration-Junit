package com.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public void validateUserDetails() {

        // Using Lambda function to validate user details.

        // To validate first name.
        UserValidatorFunction firstName = () -> {

            System.out.println("Enter your First name");
            String name = sc.next();

            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given first name is valid");
            } else {
                System.out.println("Given first name is not valid");
            }
        };
        firstName.validate();

        // To validate last name.
        UserValidatorFunction lastName = () -> {
            System.out.println("Enter your last name");
            String name = sc.next();

            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given last name is valid");
            } else {
                System.out.println("Given last name is not valid");
            }
        };
        lastName.validate();

        // To validate Email.
        UserValidatorFunction mail = () -> {

            System.out.println("Enter your Email id");
            String email = sc.next();

            Pattern pattern = Pattern.compile("^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
                System.out.println("Given email id is valid");
            else
                System.out.println("Given email id is not valid");
        };
        mail.validate();

        // To validate phone number.
        UserValidatorFunction phoneNumber = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Mobile number");
            String mobile = sc.nextLine();
            // Console does not support space.
            Pattern pattern = Pattern.compile("^(91)[0-9]{10}$");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches())
                System.out.println("Given mobile number is valid");
            else
                System.out.println("Given mobile number is not valid");
        };
        phoneNumber.validate();

        // To validate password.
        UserValidatorFunction Password = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Password");
            String password = sc.next();

            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches())
                System.out.println("Given password is valid");
            else
                System.out.println("Given password is not valid");
        };
        Password.validate();
    }
}
