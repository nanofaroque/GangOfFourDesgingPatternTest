package abstractfactorypattern.familiesofclasses;


public class MSSQLDatabaseLite implements IDatabase {

	@Override
	public void create(String dbName) {
		System.out.println(dbName);


	}

}
