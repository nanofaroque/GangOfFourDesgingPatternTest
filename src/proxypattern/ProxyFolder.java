package proxypattern;

public class ProxyFolder implements IFolder {
	Folder folder;
	User user;
	public ProxyFolder(User user) {
		super();
		this.user = user;
	}
	@Override
	public void performReadWriteOperations() {
		if(user.getDesignation().equals("CEO")){
			folder=new Folder();
			folder.performReadWriteOperations();
		}		
		else{
			System.out.println("you are not authorized to read or write operations");
		}
	}
	

	
}
