package yyl.normal;

public class NonNullExample {
	String name;

	public NonNullExample(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		this.name = name;
	}
}