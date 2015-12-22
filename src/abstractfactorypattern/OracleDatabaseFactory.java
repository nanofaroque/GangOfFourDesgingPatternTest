package abstractfactorypattern;

public class OracleDatabaseFactory extends AbstractDatabaseFactory {

	//creating actual factory object
	@Override
	IDatabase getDatabase() {
		return new OracleDatabase();
	}

}
