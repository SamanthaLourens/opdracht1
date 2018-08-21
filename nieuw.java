
class nieuw {
	public static void main(String args[]) {
		Voedsel voedsel1 = new Voedsel();       //maakt object voedsel
		voedsel1.groente();                    // roept methode groente aan
		voedsel1.kcaltellen(100);
		System.out.println(voedsel1.kcal);
	}
}



class Voedsel{
	int kcal;
	void groente() {  // methode heeft body
		System.out.println("Groente is gezond");
	}
	
	void kcaltellen(int kcal) {    //belangrijk om te declareren als int
		System.out.println("Het aantal kcal is" + kcal);
		kcal = 50;
	}
}