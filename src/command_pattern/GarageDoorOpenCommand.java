package command_pattern;

public class GarageDoorOpenCommand implements Command {

	GarageDoor mGarageDoor;
	
	 public GarageDoorOpenCommand(GarageDoor gd) {
		this.mGarageDoor=gd;	
		}
	@Override
	public void execute() {
		mGarageDoor.open();
	}

}
