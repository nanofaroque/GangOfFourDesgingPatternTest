package abstractfactorypattern.familiesofclasses;

public class DatabaseFactoryTesting {

	public static void main(String[] args) {
		//if we need to change the database we can do it here very simple..
		AbstractDatabaseFactory abstractDatabaseFactory=new OracleDatabaseFactory();
		AbstractDatabaseFactory abstractDatabaseFactory2=new MSSQLDatabaseFactory();
	}

}
