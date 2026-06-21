package CommandDesignPattern.ConcereteCommands;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class TurnOnCommand implements Command {
    private final TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
