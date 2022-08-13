import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx {

	public static void main(String[] args) {
		Date curDate = new Date();
		System.out.println(curDate.toString());
		SimpleDateFormat sft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); 
		// ex - E is Sat yyyy.mm.dd is 2022.08.13 at hh:mm:ss 10:52:45 a is am zzz is IST
		System.out.println("Cuttent Date = " + sft.format(curDate));
	}

}
