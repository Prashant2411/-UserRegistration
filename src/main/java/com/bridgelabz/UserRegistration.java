package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean isValidName(String name) {
        String regexPattern = "^[A-Z]{1}[a-z]{2,}";
        return name.matches(regexPattern);
    }

    public boolean isValidEmail(String email) {
        String regexPattern = "^[a-zA-Z0-9]+[.+_-]?[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}[.]?[a-zA-Z]{0,3}";
        return email.matches(regexPattern);
    }

    public boolean isValidMobile(String mobileNumber) {
        String regexPattern = "^[+]?[0-9]{1,3}[ ][7-9]{1}[0-9]{2}[0-9]{3}[0-9]{4}";
        return mobileNumber.matches(regexPattern);
    }

    public boolean isValidPassword(String password) {
        String regexPattern = "^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,})$";
        return password.matches(regexPattern);
    }
}
