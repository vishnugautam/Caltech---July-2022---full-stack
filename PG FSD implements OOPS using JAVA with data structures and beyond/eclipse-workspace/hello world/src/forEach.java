
public class forEach {

	public static void main(String[] args) {
		int a[] = {13,14,15,96};
		int sum = 0;
		
		for(int x: a) { // for each is used only for finite loops 
			sum += x;
		}
		
		System.out.println(sum);

	}

}
