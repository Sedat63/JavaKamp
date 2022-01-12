package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = true;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü");

		} else if (dolarBugun < dolarDun) {

			System.out.println("Dolar eþit");
		} else {
			System.out.println("Dolar yükseldi");
		}

		// *********************

		String[] krediler = { 
				
				"Hýzlý kredi", "Mutlu emekli kredisi", "Konut kredisi",
				"Çiftçi kredisi", "Msb kredisi", "Meb kredisi", "Kültür bakanlýðý kredisi"
		};
		
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//for
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//String'ler deðer tip gibi davranýr. Ýstisnai bir durumdur.
		String sehir1="Ankara";
		String sehir2="Ýstanbul";
		sehir1 = sehir2;
		sehir2="izmir";
		System.out.println(sehir1); //referans tip olsaydý cevap: Ýzmir olurdu
								    //Ancak deðer tip olduðundan cevap: Ýstanbul olur 

	}

}
