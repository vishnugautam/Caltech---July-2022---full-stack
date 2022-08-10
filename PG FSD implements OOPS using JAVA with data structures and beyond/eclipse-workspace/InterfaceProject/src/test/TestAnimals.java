package test;

import domain.Animal;
import domain.Cat;
import domain.Fish;
import domain.Pet;
import domain.Spider;

public class TestAnimals {

	public static void main(String[] args) {
		Fish f = new Fish();
		Cat  c = new Cat("Pixie");
//		Animal a = new Animal; not possible, because Animal is abstract class
		// we cannot create an object of abstract class
		
		Animal a = new Fish(); // this is possible 
		Animal e = new Spider(); 
		
		Pet p = new Cat(); // we can create an object of Cat and assign it to Pet interface
		
		f.play();
		c.play();
		
		// virtual method invocation 
		e.eat();
		e.walk();
		
		a.walk();
		
		

	}

}
