package adapter_pattern;

public class ElectricSocketAdapterTesting {

	public static void main(String[] args) {
		ElectricSocketAdapter electricSocketAdapter=new ElectricSocketAdapter();
		System.out.println(electricSocketAdapter.get3().getVolts());
	}

}
