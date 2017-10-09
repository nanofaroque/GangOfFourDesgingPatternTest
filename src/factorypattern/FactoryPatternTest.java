package factorypattern;
/**
 * http://coding-geek.com/design-pattern-factory-patterns/
 * */
public class FactoryPatternTest {
	public static final int file = 1;
	public static final int db = 2;

	public static void main(String[] args) {
		ILogger fileLogger = LoggerFactory.createLogger(file);
		fileLogger.createLog("I am writting to file...");
		
		ILogger dbLogger = LoggerFactory.createLogger(db);
		dbLogger.createLog("I am writting to db...");
	}

}
