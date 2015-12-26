package observer_pattern;

public class Testing {

	public static void main(String[] args) {
		Newspaper newspaper=new Newspaper();
		Internet internet=new Internet();
		
		Loan loan=new Loan("bank", (float) 1.01, "boa");
		loan.addObserver(newspaper);
		loan.addObserver(internet);
		
		loan.setInterest(1.1f);
		loan.notityObservers();
		
		
	}

}
