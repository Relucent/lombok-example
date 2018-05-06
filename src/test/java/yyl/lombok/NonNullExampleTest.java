package yyl.lombok;

import org.junit.Assert;
import org.junit.Test;

public class NonNullExampleTest {

	@Test
	public void nullTest() {
		Exception err = null;
		try {
			new NonNullExample(null);
		} catch (Exception e) {
			err = e;
		}
		Assert.assertNotNull(err);
	}

	@Test
	public void notNullTest() {
		new NonNullExample("hello");
	}
}
