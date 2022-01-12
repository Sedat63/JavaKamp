package kodlamaIo;

public class HomePage {
	
	public HomePage() {
		System.out.println("AnaSayfa");
		
	}
	
	public HomePage(int id, String title, String explanation, String price, String lecturer) {
		this();
		this.id = id;
		this.title = title;
		this.explanation = explanation;
		this.price = price;
		this.lecturer = lecturer;
		
	}
	
	int id;
	String title;
	String explanation;
	String price;
	String lecturer;
}
