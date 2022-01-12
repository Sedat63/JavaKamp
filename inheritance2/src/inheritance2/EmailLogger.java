package inheritance2;

public class EmailLogger extends Logger {
	
	@Override //metod eziyoruz
	public void log() {
		System.out.println("Email yollandý");
	}
}
