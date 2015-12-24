package facade_pattern;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	public ShapeMaker(){
		circle=new Circle();
		rectangle=new Rectangle();
		triangle=new Triangle();
	}
	
	void drawCircle(){
		circle.draw();
	}
	
	void drawTriangle(){
		triangle.draw();
	}
	void drawRectangle(){
		rectangle.draw();
	}
	

}
