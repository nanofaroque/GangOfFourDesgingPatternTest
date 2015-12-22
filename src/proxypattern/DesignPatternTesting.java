package proxypattern;

public class DesignPatternTesting {

	public static void main(String[] args) {
		User john=new User("","","MEO");
		ProxyFolder proxy=new ProxyFolder(john);
		proxy.performReadWriteOperations();
	}

}
