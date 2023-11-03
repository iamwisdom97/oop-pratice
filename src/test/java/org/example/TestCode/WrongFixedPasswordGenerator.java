package org.example.TestCode;

import org.example.TestCode.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {


    @Override
    public String generatePassword() {
        return "ab";  // 2글자
    }
}
