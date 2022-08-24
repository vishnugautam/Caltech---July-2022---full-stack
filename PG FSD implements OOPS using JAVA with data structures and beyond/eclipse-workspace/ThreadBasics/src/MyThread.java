// To create a thread we can use Thread class 
public class MyThread extends Thread{

//  A single thread also has a beginning, a sequence, and an end
// to implement a thread using thread class, you need to provide it with a run method that performs the threads tasks
// it’s about the use of multiple threads running at the same time and performing different tasks in a single program. 
		private int i;
		
		@Override
		// the run() method will display hello and numbers till 10
		public void run() {
			i = 0;
			while(true) {
				System.out.println("Hello: " + i++);
				if(i == 10) {
					break;
				}
			}
		}

		public static void main(String[] args) {
			Thread t = new MyThread();
			// start method triggers run method of the thread
			t.start();
		}
}

