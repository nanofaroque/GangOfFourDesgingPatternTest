package command_pattern;

public class SimpleRemoteControl {
	Command slot; ///slot of the remote 
	
	public SimpleRemoteControl(){
	}
	
	public void setCommand(Command cmd){
		this.slot=cmd;
	}
	
	public void buttonPressed(){
		slot.execute();
	}

}
