package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean isValid(String name) {
        String regexPattern = "^[A-Z]{1}[a-z]*";
        return name.matches(regexPattern);
    }
}
