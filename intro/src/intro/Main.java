package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = true;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t�");

		} else if (dolarBugun < dolarDun) {

			System.out.println("Dolar e�it");
		} else {
			System.out.println("Dolar y�kseldi");
		}

		// *********************

		String[] krediler = { 
				
				"H�zl� kredi", "Mutlu emekli kredisi", "Konut kredisi",
				"�ift�i kredisi", "Msb kredisi", "Meb kredisi", "K�lt�r bakanl��� kredisi"
		};
		
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//for
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//String'ler de�er tip gibi davran�r. �stisnai bir durumdur.
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1 = sehir2;
		sehir2="izmir";
		System.out.println(sehir1); //referans tip olsayd� cevap: �zmir olurdu
								    //Ancak de�er tip oldu�undan cevap: �stanbul olur 

	}

}
