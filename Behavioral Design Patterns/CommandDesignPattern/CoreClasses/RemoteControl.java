package CommandDesignPattern.CoreClasses;

import CommandDesignPattern.Command;

public class RemoteControl {
     private Command turnOnCommand;
     private Command turnOffCommand;
     private Command adjustVolumeCommand;
     private Command changeChannelCommand;

     public void setTurnOnCommand(Command turnOnCommand) {
          this.turnOnCommand = turnOnCommand;
     }

     public void setTurnOffCommand(Command turnOffCommand) {
          this.turnOffCommand = turnOffCommand;
     }

     public void setAdjustVolumeCommand(Command adjustVolumeCommand) {
          this.adjustVolumeCommand = adjustVolumeCommand;
     }

     public void setChangeChannelCommand(Command changeChannelCommand) {
          this.changeChannelCommand = changeChannelCommand;
     }

     public void pressOnButton(){
          this.turnOnCommand.execute();
     }

     public void pressOffButton(){
          this.turnOffCommand.execute();
     }

     public void pressVolumeButton(){
          this.adjustVolumeCommand.execute();
     }

     public void pressChannelButton(){
          this.changeChannelCommand.execute();
     }
}
