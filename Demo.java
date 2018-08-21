
class Demo {
	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		auto1.snelheid = 100;
		auto2.snelheid = 150;
		if (auto1.snelheid > auto2.snelheid)
			System.out.println("auto1 sneller dan auto2");
		else 
			System.out.print("auto2 sneller");
		
	}

}


class Auto{
	int snelheid;
}

