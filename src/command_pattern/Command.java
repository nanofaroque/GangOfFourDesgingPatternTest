package command_pattern;

//this will be used as a command 
public interface Command {
	//all of the concrete command will execute this method 
	//Single method interfaces are called functional interface 
	void execute();

}
