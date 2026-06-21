package CommandDesignPattern.ConcereteCommands;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class ChangeChannelCommand implements Command {
    private final TV tv;
    private final int channel;

    public ChangeChannelCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
