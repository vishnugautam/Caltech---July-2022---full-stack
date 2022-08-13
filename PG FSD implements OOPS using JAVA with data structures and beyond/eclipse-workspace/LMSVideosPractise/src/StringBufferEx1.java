
public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Welcome");
		sb2.reverse(); // it reverses "emoclew"
		System.out.println(sb1.capacity()); // 16 bytes by default for empty string 
		sb1.append("Hello");
		System.out.println(sb1.capacity());
		sb1.append("Java is my favorite language");
		System.out.println(sb1.capacity()); // 16 *2 + 2 = 34 bytes 
		// how much string buffer is allocating internally 
		System.out.println(sb2);
	}

}
