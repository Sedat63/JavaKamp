package abstractClasses;

public abstract class GameCalculatorBase {

	public abstract void Hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
