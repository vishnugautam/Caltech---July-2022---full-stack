package domain;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat(String n) {
		super(4); // this is for the legs from the parent class
		this.name = n;
	}
	
	public Cat() {
		this("");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void play() {
		System.out.println(name + "it likes to play with strings");
	}
	
	// if we extend from an abstract class then we have to implement its abstract method as well
	// otherwise it throws error 
	public void eat() {
		System.out.println("The cat like to eat cat food");
	}
}
