package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean isValidName(String name) {
        String regexPattern = "^[A-Z]{1}[a-z]{2,}";
        return name.matches(regexPattern);
    }
}
