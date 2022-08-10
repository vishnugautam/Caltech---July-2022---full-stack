package domain;

// we made this as an abstract class because the eat() method is different for each animal 
// if we have an abstract method then even the class has to be abstract class 
public abstract class Animal {
	
	// we can have instance variable in abstract class
	protected int legs;
	
	// we can have constructor in abstract class
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	// we can have an abstract method in abstract class
	// abstract method
	public abstract void eat();
	
	// we can have concrete method in abstract class
	// concrete method 
	public void walk() {
		System.out.println("This animal walks on " + legs + "legs");
	}
}
