package factorypattern;

public class Testing {

	public static void main(String[] args) {
		AnimalFactory factory=new AnimalFactory();
		Animal animal=factory.createAnimal("cat");
		animal.eat();
	}

}
