
public class Enums {
	final static int MARS = 0;
	final static int V = 1;
	final static int EARTH = 2;
	
	Planet myX = Planet.MARS;
	public static void main(String[] args) {
//		Planet myX = Planet.EARTH;
//		f(myX);
//		Enums enums = new Enums();
//		Planet p = new Planet();
		String txt = Chocolate.MARS.txt();
		System.out.println(txt);
		System.out.println(123);
		System.out.println();
		System.out.println(Chocolate.MARS);
		System.out.println(Chocolate.BRAND1.getFavs());

		Chocolate[] values = Chocolate.values();
		for (Chocolate choco : Chocolate.values()) {
			System.out.println(choco.getFavs());
		}

		System.out.println(Chocolate.valueOf("BRAND1") == Chocolate.BRAND1);
		;
	}
	private static void f(Planet myX2) {
		// TODO Auto-generated method stub
	}
}


//enum Planet { MARS, V, EARTH, MA }
enum Planet { MARS, V, EARTH, MA();
	Planet() {
		
	}
}

enum Chocolate {
	MARS(4198), BRAND1(893), BRAND2(67983);
	// adattag
	private int favs;
	
	// konstruktor
	Chocolate(int favs) {
		this.favs = favs;
	}

	// metodus
	public String txt() {
		return this.name() + name();
	}

	public int getFavs() {
		return favs;
	}
}
