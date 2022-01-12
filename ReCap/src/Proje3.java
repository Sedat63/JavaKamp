
public class Proje3 {

	public static void main(String[] args) {
		// Mükemmel sayýlar: kendinden baþka tüm pozitif bölenleri kendisine eþit olan sayýdýr.
		//Ör: 6. Bölenleri 1,2,3. Toplamlarý: 1+2+3=6
		
		int number = 6;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total +i;
			}
		}
		
		if (total == number) {
			 System.out.println("Mükemmel sayýdýr");
		}else {
			 System.out.println("Mükemmel sayý deðildir");
		}
		

	}

}
