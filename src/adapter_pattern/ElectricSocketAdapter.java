package adapter_pattern;

public class ElectricSocketAdapter implements SocketAdapter {

	Socket socket=new Socket();
	@Override
	public Volt get120() {
		return socket.getVolt();
	}

	@Override
	public Volt get12() {
		Volt volt=socket.getVolt();
		return new Volt(volt.getVolts()/10);
	}

	@Override
	public Volt get3() {
		Volt volt=socket.getVolt();
		return new Volt(volt.getVolts()/40);

	}

}
