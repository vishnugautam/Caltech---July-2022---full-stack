
public class Pluto extends MethodOverRide{
	public void earth() {
		System.out.println("Pluto is also a planet");
	}
	public static void main(String[] args) {
		Pluto  pluto = new Pluto();
		pluto.earth();
		// subclass pluto takes precedence over planet class's method earth 
		// if you want the parent class's method then you have to upper cast and super

	}

}
