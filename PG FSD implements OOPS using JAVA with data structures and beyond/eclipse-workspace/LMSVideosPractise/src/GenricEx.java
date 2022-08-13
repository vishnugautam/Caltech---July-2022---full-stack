class Test<T>{ // generic class object 
	// T is a datatype - anytype
		T obj;
		
		Test(T obj){ // constructor
			this.obj = obj;
		}
		public T getObject() {
			return this.obj;
		}
	}
public class GenricEx {
	
	public static void main(String[] args) {
		Test<Integer> jobj = new Test <Integer> (15); // we are dealing with integer wrapper datatype 
		System.out.println(jobj.getObject());
		Test< String > mobj = new Test <String> ("This is an example for Generic "); 
		// we are dealing with String 
		System.out.println(mobj.getObject());
	}
}
// concrete class - all of the classes methods are implemented and we can just use it meanwhile in 
// abstract class we have to define the methods in the classes we inherit it into
// abstract classes are function headers or prototype signature or function signature are written but the 
// implementation is left to class which extends it ot inherits it 