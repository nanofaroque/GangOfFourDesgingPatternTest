package abstractfactorypattern.familiesofclasses;

public abstract class AbstractDatabaseFactory {
	//creating abstract database factory
	//no static method because child will create their own database
	abstract IDatabase getDatabaseLite();
	abstract IDatabase getDatabaseProfessional();

	
	private String readFromConfig(String key){
		//config file define what database should be created 
		return "";
	}

}
