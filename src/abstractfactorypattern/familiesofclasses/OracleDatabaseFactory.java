package abstractfactorypattern.familiesofclasses;

public class OracleDatabaseFactory extends AbstractDatabaseFactory {

	@Override
	IDatabase getDatabaseLite() {
		// TODO Auto-generated method stub
		return new OracleDatabaseLite();
	}

	@Override
	IDatabase getDatabaseProfessional() {
		// TODO Auto-generated method stub
		return new OracleDatabaseProfessional();
	}

	

}
