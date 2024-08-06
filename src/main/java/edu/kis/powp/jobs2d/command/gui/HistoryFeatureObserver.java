package edu.kis.powp.jobs2d.command.gui;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.manager.CommandManager;
import edu.kis.powp.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class HistoryFeatureObserver implements Subscriber {
    private CommandManager commandManager;
    public DriverCommand currentCommand;
    public List<DriverCommand> commandList = new ArrayList<>();

    public HistoryFeatureObserver(CommandManager commandManager) {
        super();
        this.commandManager = commandManager;
    }

    public String toString() {
        return "Command history observer for command history window";
    }

    public void addToCommandList(DriverCommand command) {
        commandList.add(command);
        System.out.println("Recorded command added to history");
    }

    @Override
    public void update() {
        this.currentCommand = commandManager.getCurrentCommand();
        System.out.println("HistoryFeatureObserver: " + commandManager.getCurrentCommandString());
    }
}
