package demo;

class ThreadClass implements Runnable{
	Thread thread;
	String threadName;
	
	ThreadClass(String name){
		this.threadName = name;
		System.out.println("Creating thread: " + this.threadName); // 2 and 6. this message comes from the constructor 
	}
	
	public void run() { // when the thread is started it goes to the run state // 9. comes here
		System.out.println("Running thread: " + this.threadName); // 10. Java module will decide when to start it and as soon
		// as it runs it will display this message 
		// 13. thread2 instance is running 
		try {
			for(int i = 5; i > 0; i--) { // multiple threads in a thread // 11. thread 1 instance 5 is started
				// 14. thread2 instance 5 is started 
				System.out.println("Thread name: " + this.threadName + " " + i);
				thread.sleep(50); // threading module will give to someother thread only when a particular thread is in sleep state or wait state
//			    another thread starts 12. after sleep 
			}
		} 
		catch(InterruptedException e) {
			System.out.println("Thread with name: " + this.threadName + " is stopped in between");
		}
		System.out.println("Thread with thread name " + this.threadName + " exited");// if thread gets executed this shows up 
	}

	public void start() {
		System.out.println("Starting thread with thread name: " + this.threadName); // 4 and 8.this is executed 
		if(thread == null) { // if thread is null
			thread = new Thread(this, this.threadName); // we are internally creating a thread 
			thread.start(); // we are starting it
		}
		
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass("thread1 instance"); // 1. new thread is created from ThreadDemo class
		t1.start(); // 3. it will initiate start() in ThreadClass
		ThreadClass t2 = new ThreadClass("thread2 instance"); // 5. new thread is created from ThreadDemo class
		t2.start(); // 7. it will initiate start() in ThreadClass
	}

}
