package yyl.normal;

public class SynchronizedExample {

	private static final Object $LOCK = new Object[0];

	private final Object $lock = new Object[0];

	private final Object lock = new byte[0];

	public static void methodA1() {
		synchronized ($LOCK) {
			System.out.println("hello method A1");
		}
	}

	public static void methodA2() {
		synchronized ($LOCK) {
			System.out.println("hello method A2");
		}
	}

	public void methodB1() {
		synchronized (this.$lock) {
			System.out.println("hello method B1");
		}
	}

	public void methodB2() {
		synchronized (this.$lock) {
			System.out.println("hello method B2");
		}
	}

	public void methodC1() {
		synchronized (this.lock) {
			System.out.println("hello method C1");
		}
	}

	public void methodC2() {
		synchronized (this.lock) {
			System.out.println("hello method C2");
		}
	}
}
