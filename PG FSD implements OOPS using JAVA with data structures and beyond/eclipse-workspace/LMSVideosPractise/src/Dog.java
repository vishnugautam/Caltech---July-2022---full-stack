
public class Dog extends Animal{

	public void eat() {
		System.out.println("Dog eating");
	}
	
	public void bark() {
		System.out.println("Woof");
	}
	
	public static void main(String[] args) {
		Dog implicit = new Dog();
		implicit.eat();
		Animal implicit = dog; // implicit casting
		Animal implicitly = (Animal) dog; // explicit casting
		
		implicitly.eat();
		implicit.eat();
		
	}
}
