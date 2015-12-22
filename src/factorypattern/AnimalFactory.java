package factorypattern;

public class AnimalFactory {
	
	public Animal createAnimal(String type){
		if(type==null){
			return null;
		}
		
		if(type.equalsIgnoreCase("dog")){
			return new Dog();
		}
		
		if(type.equalsIgnoreCase("cat")){
			return new Cat();
		}
		return null;
	}

}
