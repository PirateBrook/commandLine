package com.piratebrook.command.exception;

import org.apache.commons.cli.MissingArgumentException;

import static com.piratebrook.command.utils.PrintTo.printErr;

public class ExceptionHandler {

    public static void toHandle(Exception e) {

        if (e instanceof MissingArgumentException) {
            printErr(((MissingArgumentException) e).getOption() + " 缺少参数");
        } else {
            e.printStackTrace();
        }
    }
}
