package org.example;

public class CorrectlyFixedPasswordGenerator implements org.example.PasswordGenerator {

    @Override
    public String generatePassword(){
        return "asdfasdf";
    }
}
