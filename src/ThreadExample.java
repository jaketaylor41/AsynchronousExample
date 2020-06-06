
//Creating threads through the extension of the Thread class
//Override the run() method
public class ThreadExample extends Thread {
	
	public void run() {
		System.out.println("Running Async Thread");
	}

	public static void main(String[] args) {
		
		(new ThreadExample()).start();
		

	}

}
