package command_pattern;

public class Testing {

	public static void main(String[] args) {
		LightOnCommand lightOnCommand=new LightOnCommand(new Light());
		GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(new GarageDoor());
		SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonPressed();
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonPressed();


	
	}

}
