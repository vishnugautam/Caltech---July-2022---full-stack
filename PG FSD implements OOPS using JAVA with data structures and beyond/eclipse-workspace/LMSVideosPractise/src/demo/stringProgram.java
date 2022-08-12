package demo;

public class stringProgram {

	public static void main(String[] args) {
		String strVar1 = "String function program";
		String strVar2 = "String program";
		String strVar3 = "function String function";
		
		System.out.println(strVar1.charAt(3));
		System.out.println(strVar1.compareToIgnoreCase(strVar2));
		System.out.println(strVar1.concat(strVar2));
		System.out.println(strVar1.contains(strVar2));
		System.out.println(strVar1.endsWith("gram"));
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.hashCode());
		System.out.println(strVar1.indexOf("program"));
		System.out.println(strVar1.isEmpty());
		System.out.println(strVar3.lastIndexOf("function"));
		System.out.println(strVar1.length());
		System.out.println(strVar1.replace("function", "java"));
		System.out.println(strVar1.startsWith("S"));
		System.out.println(strVar1.toLowerCase());
		System.out.println(strVar1.toUpperCase());
		System.out.println(strVar1.trim()); // remove the spaces before and after
	}

}
