package proxypattern;

public class Folder implements IFolder {

	@Override
	public void performReadWriteOperations() {
		System.out.println("Performing read or write operations");		
	}

}
