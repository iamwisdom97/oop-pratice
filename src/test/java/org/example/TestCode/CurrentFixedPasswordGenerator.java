package org.example.TestCode;

import org.example.TestCode.PasswordGenerator;

public class CurrentFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgh";  // 8글자
    }
}
