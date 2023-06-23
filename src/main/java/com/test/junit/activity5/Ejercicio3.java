package com.test.junit.activity5;

public class Ejercicio3 {
    public String mask(String password) {
        if (password.length() < 5)
            return "password too short";
        else if (password.length() >= 5 && password.length() <=8)
            return "********";
        else if (password.length() >= 12 && password.length() <=40)
            return "************";
        else
            return "password too long";
    }
}
