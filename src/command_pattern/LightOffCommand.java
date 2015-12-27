package command_pattern;

public class LightOffCommand implements Command {
	Light mLight;

	public LightOffCommand(Light light){
		this.mLight=light;
	}
	@Override
	public void execute() {
		mLight.off();
	}

}
