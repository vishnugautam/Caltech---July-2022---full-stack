
public class MultiThreadPriorityex1 extends Thread{
	public void run() {
		System.out.println("Active Thread name = " + Thread.currentThread().getName());
		System.out.println("Active Thread priority =" + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		MultiThreadPriorityex1 mtp1 = new MultiThreadPriorityex1();
		MultiThreadPriorityex1 mtp2 = new MultiThreadPriorityex1();
		
		mtp1.setPriority(MIN_PRIORITY);
		mtp2.setPriority(MAX_PRIORITY);
		mtp1.start();
		mtp2.start();
	}

}
