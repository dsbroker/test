public class Fakultaet {

	int i;
	int userEingabe;
	long ergebnis = 1;

	// Konstruktor
	Fakultaet(int userEingabe) {
		rechnung(userEingabe);
	}

	// Methode
	void rechnung(int limit) {
		for (i = 2; i <= limit; i++) {
			ergebnis = ergebnis * i;
			System.out.println("Zwischensumme: " + ergebnis);
		}
		System.out.println("Ergebnis: " + ergebnis + ".");
	}

	// Main-Methode
	public static void main(String[] args) {
		Fakultaet fakultaet = new Fakultaet(5);
	}

}