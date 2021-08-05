package kodluyoruz.multithreading_in_java;

public class App {
	public static void main(String[] args) {
		Task task = new Task();

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();
	}
}
