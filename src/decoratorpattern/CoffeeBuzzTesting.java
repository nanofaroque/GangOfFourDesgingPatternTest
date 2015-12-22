package decoratorpattern;

public class CoffeeBuzzTesting {

	public static void main(String[] args) {
		Beverages b=new Espresso();
		b=new Mocha(b);
		System.out.println(b.cost());
		b=new Whip(b);
		System.out.println(b.cost());
	}

}
