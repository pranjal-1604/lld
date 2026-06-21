package CommandDesignPattern;

import CommandDesignPattern.ConcereteCommands.AdjustVolumeCommand;
import CommandDesignPattern.ConcereteCommands.ChangeChannelCommand;
import CommandDesignPattern.ConcereteCommands.TurnOffCommand;
import CommandDesignPattern.ConcereteCommands.TurnOnCommand;
import CommandDesignPattern.CoreClasses.RemoteControl;
import CommandDesignPattern.CoreClasses.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        TurnOnCommand turnOnCommand = new TurnOnCommand(tv);
        TurnOffCommand turnOffCommand = new TurnOffCommand(tv);
        AdjustVolumeCommand adjustVolumeCommand = new AdjustVolumeCommand(tv,5);
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(tv, 3);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setTurnOnCommand(turnOnCommand);
        remoteControl.setTurnOffCommand(turnOffCommand);
        remoteControl.setAdjustVolumeCommand(adjustVolumeCommand);
        remoteControl.setChangeChannelCommand(changeChannelCommand);
        remoteControl.pressOnButton();
        remoteControl.pressOffButton();
        remoteControl.pressVolumeButton();
        remoteControl.pressChannelButton();
    }
}
