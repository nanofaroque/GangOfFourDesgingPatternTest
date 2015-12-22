package factorypattern;

public class AnimalFactory {
	
	public Animal createAnimal(String type){
		//This if/else is bad coding .. it is just used as example
		//this code violets the open-close principle
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
