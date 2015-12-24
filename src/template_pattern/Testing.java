package template_pattern;

public class Testing {

	public static void main(String[] args) {
		Game game=new Cricket();
		game.play();
		System.out.println("************************");
		Game g=new Football();
		g.play();
	}

}
