
class a {
	public static void main(String args[]) {
		Kledingwinkel hm = new Kledingwinkel();
		hm.broekPassen(10);
		hm.broekenKopen(16);
	}
}


class Kledingwinkel{
	Broek broekenKopen(int geld) {
		if (geld > 15) {
			System.out.println("Veel plezier met je nieuwe broek" );
			return new Broek();
		} else {
			return null;
		}
	}
	
	Broek broekPassen(int maat) {
		if (maat != Broek.maat) {
			System.out.println("Broek past niet, geef me een nieuwe");
			return new Broek();
		}else {
			System.out.println("jeeeeeeeeh");
			return new Broek();
		}
	}
	
}


class Broek{
	static int maat = 10;
}