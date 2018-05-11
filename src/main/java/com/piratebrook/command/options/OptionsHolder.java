package com.piratebrook.command.options;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class OptionsHolder implements LocalOptions {

    private Options mOptions;

    public OptionsHolder() {
        init();
    }

    private void init() {
        mOptions = new Options();

        // Boolean Options
        Option help = new Option(LocalOptions.help, "print this message");
        Option projecthelp = new Option(LocalOptions.projecthelp, "print project help information");
        Option version = new Option(LocalOptions.version, "print the version information and exit");
        Option verbose = new Option(LocalOptions.verbose, "be extra verbose");
        Option quite = new Option(LocalOptions.quite, "be extra quite");
        Option debug = new Option(LocalOptions.debug, "print debugging information");
        Option emacs = new Option(LocalOptions.emacs, "produce logging information without adornments");

        // Argument Options
        Option logfile = Option.builder(LocalOptions.logfile)
                .argName("file")
                .hasArg()
                .desc("use given file for log")
                .build();

        Option logger = Option.builder(LocalOptions.logger)
                .argName("classname")
                .hasArg()
                .desc("the class which it to perform " + "logging")
                .build();

        Option listener = Option.builder(LocalOptions.listener)
                .argName("classname")
                .hasArg()
                .desc("add an instance of class as " + "a project listener")
                .build();

        Option buildfile = Option.builder(LocalOptions.buildfile)
                .argName("file")
                .hasArg()
                .desc("use given buildfile")
                .build();

        Option find = Option.builder(LocalOptions.find)
                .argName("file")
                .hasArg()
                .desc("search for buildfile towards the " + "root of the filesystem and use it")
                .build();

        // Java Property Options
        Option property = Option.builder(LocalOptions.D)
                .argName("property=value")
                .numberOfArgs(2)
                .valueSeparator()
                .desc("use value for give property")
                .build();

        mOptions.addOption(help);
        mOptions.addOption(projecthelp);
        mOptions.addOption(version);
        mOptions.addOption(quite);
        mOptions.addOption(verbose);
        mOptions.addOption(debug);
        mOptions.addOption(emacs);
        mOptions.addOption(logfile);
        mOptions.addOption(logger);
        mOptions.addOption(listener);
        mOptions.addOption(buildfile);
        mOptions.addOption(find);
        mOptions.addOption(property);
    }

    public Options getOptions() {
        return mOptions;
    }
}
