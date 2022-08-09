public class forLoop {
	public static void main(String[] args) {
		label0: for (int a=1; a<=3; a++) {
			label1: for (int b=1; b<=3; b++) {
				if(a==2 && b==2) {
					break label1;
				}
				System.out.println(a + " " + b);
			}
		}
	}
}
