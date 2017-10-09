package abstractfactorypattern.familiesofclasses;

public class OracleDatabaseLite implements IDatabase {

	@Override
	public void create(String dbName) {
		System.out.println(dbName);

	}

}
