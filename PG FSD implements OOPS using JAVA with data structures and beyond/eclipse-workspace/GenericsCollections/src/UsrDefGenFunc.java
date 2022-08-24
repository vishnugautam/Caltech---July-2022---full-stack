
public class UsrDefGenFunc {
	// a generic method example
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}
	public static void main(String[] args) {
		// since static type it can be called without instantiating the class 
		// Calling generic method with Integer argument
        genericDisplay(11);
  
        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");
  
        // Calling generic method with double argument
        genericDisplay(1.0);
        
//        T – Type
//        E – Element
//        K – Key
//        N – Number
//        V – Value

	}

}
