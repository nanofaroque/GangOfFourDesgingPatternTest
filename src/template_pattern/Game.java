package template_pattern;

public abstract class Game {
	public abstract void init();
	public abstract void start();
	public abstract void end();
	
	//template method 
	public final void play(){
		
		init();
		
		start();
		
		end();
	}
}
