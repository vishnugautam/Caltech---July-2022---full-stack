package demo;

public class CheckPolymorphise {

	public static void main(String[] args) {
		HouseArchitecture ha; // variable of type HouseArchitecture 
		// this ha acts like a single interface where it behave like villas 
		// farmhouse and apartment objects 
		
		// based on the situation it behaves like that and gives back info that is called polymorphism 
		ha = new Villas();
		System.out.println("The price of a Villa is: " + ha.getPrice() + "The banks that offer loan are: " + ha.getLoanBank());
		ha = new Apartments();
		System.out.println("The price of an apartment is: " + ha.getPrice() + "The banks that offer loan are: " + ha.getLoanBank());
		ha = new FarmHouse();
		System.out.println("The price of a Farm house is: " + ha.getPrice() + "The banks that offer loan are: " + ha.getLoanBank());

	}

}
