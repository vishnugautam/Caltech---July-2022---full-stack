package demo;
// In Java, a constructor is a block of codes similar to the method. 
//It is called when an instance of the class is created. At the time of calling constructor, 
//memory for the object is allocated in the memory.
//It is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.

//It calls a default constructor if there is no constructor available in the class. 
//In such case, Java compiler provides a default constructor by default.

public class ConstructEx1 {
	int number;
	String name;
	int age;
	
	ConstructEx1(int number, String name, int roll, int age){
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		ConstructEx1 cx1 = new ConstructEx1(10, "Vishnu", 123, 28); 
		// you just cannot call this 123 as it is not initialised in the class's variables 
		// so to use the variables in the class and set values we must put it in the constructor and then instanciate it 
		System.out.println(cx1.number + cx1.age);
		
	}

}
