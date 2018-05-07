package yyl.lombok;

public class ConstructorExampleTest {
	public static void main(String[] args) {

		new ConstructorExample<String>();

		// Long id, String name, T value
		new ConstructorExample<String>(1L, "hello", "hello");

		ConstructorExample.of("hello");
	}
}
