package com.cygnus.app.util;

public class EmailConfirmTokenUtil {

    public static String generate() {
        return Integer.toString((int) (Math.random() * 1000));
    }

}
