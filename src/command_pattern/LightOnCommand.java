package command_pattern;
//concrete command
public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light lt){
		this.light=lt;
	}
	@Override
	public void execute() {
		light.on();
	}

}
