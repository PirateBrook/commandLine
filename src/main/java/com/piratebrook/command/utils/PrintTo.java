package com.piratebrook.command.utils;

public class PrintTo {

    public static void println(String message) {
        System.out.println(message);
    }

    public static void printErr(String message) {
        System.err.println("error : " + message);
    }

    public static void printErr(final Throwable throwable) {
        final String message = throwable.getMessage();
        if (message != null) {
            System.err.println("error : " + message);
        }
    }
}
