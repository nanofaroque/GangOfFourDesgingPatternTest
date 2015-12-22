package factorypattern;

public class Testing {

	public static void main(String[] args) {
		AnimalFactory factory=new AnimalFactory();
		Animal animal=factory.createAnimal("cat");
		animal.eat();
		/*
		 * Cat object has been created here but if you have any extra method other than eat
		 * you can not call it because: You can only access the methods defined on the interface through 
		 * a variable declared as having that interface, 
		 * even if the concrete class has additional methods
		 * */
		
	}

}
