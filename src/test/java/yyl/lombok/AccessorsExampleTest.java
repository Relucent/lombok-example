package yyl.lombok;

import org.junit.Test;

public class AccessorsExampleTest {

	@Test
	public void test() {
		AccessorsExample model = new AccessorsExample().setName("hello").setValue("world");
		System.out.println(model.getName() + " " + model.getValue());
	}
}
