package factorypattern;

public class LoggerFactory {
	public static ILogger createLogger(int type){
		if(type ==1){
			return new FileSystemLogger();
		}else{
			return new DatabaseLogger();
		}
	
	}

}
