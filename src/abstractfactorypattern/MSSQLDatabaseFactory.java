package abstractfactorypattern;

public class MSSQLDatabaseFactory extends AbstractDatabaseFactory {

	//creating actual factory object
	@Override
	IDatabase getDatabase() {
		// TODO Auto-generated method stub
		return new MSSQLDatabase();
	}

}
