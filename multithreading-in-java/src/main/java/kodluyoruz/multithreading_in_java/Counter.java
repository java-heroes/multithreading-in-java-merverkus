package kodluyoruz.multithreading_in_java;

public class Counter {
	int count;

	public synchronized void increment() {
		System.out.println(count++);
	}
}
