
public class Proje3 {

	public static void main(String[] args) {
		// M�kemmel say�lar: kendinden ba�ka t�m pozitif b�lenleri kendisine e�it olan say�d�r.
		//�r: 6. B�lenleri 1,2,3. Toplamlar�: 1+2+3=6
		
		int number = 6;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total +i;
			}
		}
		
		if (total == number) {
			 System.out.println("M�kemmel say�d�r");
		}else {
			 System.out.println("M�kemmel say� de�ildir");
		}
		

	}

}
