package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.manager.ICommandManager;

public class HistoryFeature {
    private static Application application;

    public static void setupHistoryFeature(Application app) {
        application = app;
        application.addComponentMenu(edu.kis.powp.jobs2d.features.HistoryFeature.class, "History");
    }

    public static void addToHistory(DriverCommand command, String commandName) {
        application.addComponentMenuElement(edu.kis.powp.jobs2d.features.HistoryFeature.class, commandName, (e) -> {
            ICommandManager manager = CommandsFeature.getCommandManager();
            manager.setCurrentCommand(command);
        });
    }
}
