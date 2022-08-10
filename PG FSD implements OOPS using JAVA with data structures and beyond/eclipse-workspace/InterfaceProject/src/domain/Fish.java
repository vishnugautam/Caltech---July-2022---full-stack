package domain;

public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		super(0);

	}
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
		this.name = n;
		
	}

	@Override
	public void play() {
		System.out.println("Fish swim in their tanks");
		
	}

	@Override
	public void eat() {
		System.out.println("Fish eats pond scum.");

	}
	
	@Override
	public void walk() {
//		 super.walk();
		System.out.println("Fish cant walk but they can swim");

	}
	
}
