package CommandDesignPattern.ConcereteCommands;

import CommandDesignPattern.Command;
import CommandDesignPattern.CoreClasses.TV;

public class AdjustVolumeCommand implements Command {
    private final TV tv;
    private final int volume;

    public AdjustVolumeCommand(TV tv,int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.adjustVolume(volume);
    }
}
