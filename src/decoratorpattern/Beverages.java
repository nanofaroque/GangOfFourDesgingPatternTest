package decoratorpattern;

public abstract class Beverages {
	public String description;
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
