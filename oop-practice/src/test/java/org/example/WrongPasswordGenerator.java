package org.example;

public class WrongPasswordGenerator implements org.example.PasswordGenerator{

    @Override
    public String generatePassword(){
        return "As";
    }
}
