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
}
