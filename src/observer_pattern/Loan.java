package observer_pattern;

import java.util.ArrayList;

public class Loan implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;

    public Loan(String type, float interest, String bank) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
 }


	public ArrayList<Observer> getObservers() {
		return observers;
	}


	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getInterest() {
		return interest;
	}


	public void setInterest(float interest) {
		this.interest = interest;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void deleteObserver(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notityObservers() {
		for(Observer observer:observers){
			observer.update(interest);
		}
	}

}
