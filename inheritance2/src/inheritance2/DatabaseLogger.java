package inheritance2;

public class DatabaseLogger extends Logger {
	
	@Override //metod eziyoruz
	public void log() {
		System.out.println("Database loglandý");
	}

}
