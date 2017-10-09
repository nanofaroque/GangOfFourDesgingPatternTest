package factorypattern;

public class DatabaseLogger implements ILogger {
	
	@Override
	public void createLog(String s) {
		System.out.println(s);
		
	}

}
