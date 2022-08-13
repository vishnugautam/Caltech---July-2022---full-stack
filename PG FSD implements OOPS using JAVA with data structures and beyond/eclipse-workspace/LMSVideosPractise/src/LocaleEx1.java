import java.util.*;

public class LocaleEx1 {

	public static void main(String[] args) {
		Locale l1 = new Locale("EN", "INDIA"); 
		System.out.println("Locale = " + l1);// en_INDIA
		System.out.println("Language = " + l1.getDisplayLanguage());
		System.out.println("Country name = " + l1.getDisplayCountry());
		System.out.println("Hashcode = " + l1.hashCode());
	}
}
