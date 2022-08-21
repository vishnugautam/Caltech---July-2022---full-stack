
public class HelloRunner implements Runnable {
	private int i;
	// run method is considered as a child thread
	public void run() {
		i = 0;
		
		while(true) {
			System.out.println("Hello : " + i++);
			if(i == 10) {
				break;
			}
		}
	}
}
