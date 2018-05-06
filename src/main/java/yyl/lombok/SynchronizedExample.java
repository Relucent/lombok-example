package yyl.lombok;

import lombok.Synchronized;

public class SynchronizedExample {

	private final Object lock = new byte[0];

	@Synchronized
	public static void methodA1() {
		System.out.println("hello method A1");
	}

	@Synchronized
	public static void methodA2() {
		System.out.println("hello method A2");
	}

	@Synchronized
	public void methodB1() {
		System.out.println("hello method B1");
	}

	@Synchronized
	public void methodB2() {
		System.out.println("hello method B2");
	}

	@Synchronized("lock")
	public void methodC1() {
		System.out.println("hello method C1");
	}

	@Synchronized("lock")
	public void methodC2() {
		System.out.println("hello method C2");
	}
}
