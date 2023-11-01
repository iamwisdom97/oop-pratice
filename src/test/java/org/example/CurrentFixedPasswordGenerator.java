package org.example;

public class CurrentFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcdefgh";  // 8글자
    }
}
