package abstractfactorypattern.familiesofclasses;

public class DatabaseFactoryTesting {

	public static void main(String[] args) {
		//if we need to change the database we can do it here very simple..
		AbstractDatabaseFactory oracleDBFactory=new OracleDatabaseFactory();
		AbstractDatabaseFactory mSSQLDBFactory=new MSSQLDatabaseFactory();
		
		oracleDBFactory.getDatabaseLite().create("Oracle Base Lite");
		oracleDBFactory.getDatabaseProfessional().create("Oracle Professionals");
		
		mSSQLDBFactory.getDatabaseLite().create("MSSQL Base Lite");
		mSSQLDBFactory.getDatabaseProfessional().create("MSSQL Professionals");
		
	}

}
