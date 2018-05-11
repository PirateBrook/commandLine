package com.piratebrook.command;

import com.piratebrook.command.options.LocalOptions;
import com.piratebrook.command.options.OptionsHolder;
import org.apache.commons.cli.*;

import static com.piratebrook.command.exception.ExceptionHandler.toHandle;
import static com.piratebrook.command.utils.PrintTo.printErr;
import static java.lang.System.exit;

public class Main {

    public static void main(String... args) {
        start(args);
    }

    private static void start(String[] args) {
        final Main m = new Main();
        m.startBrook(args);
    }

    private void startBrook(String[] args) {
        try {
            processArgs(args);
        } catch (final Throwable e) {
            printErr(e);
            exit(1);
        }
    }

    private static void processArgs(String[] args) {
        OptionsHolder optionsHolder = new OptionsHolder();

        CommandLineParser parser = new DefaultParser();

        CommandLine cmd;

        try {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("brook", optionsHolder.getOptions());
            cmd = parser.parse(optionsHolder.getOptions(), args);
            if (cmd.hasOption(LocalOptions.help)) {
                formatter.printHelp("brook", optionsHolder.getOptions());
            }
        } catch (ParseException e) {
            toHandle(e);
        }
    }
}
