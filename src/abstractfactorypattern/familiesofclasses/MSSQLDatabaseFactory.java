package abstractfactorypattern.familiesofclasses;

public class MSSQLDatabaseFactory extends AbstractDatabaseFactory {

	@Override
	IDatabase getDatabaseLite() {
		// TODO Auto-generated method stub
		return (IDatabase) new MSSQLDatabaseLite();
	}

	@Override
	IDatabase getDatabaseProfessional() {
		// TODO Auto-generated method stub
		return new MSSQLDatabaseProfessionals();
	}

	
	

}
