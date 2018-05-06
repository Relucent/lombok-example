package yyl.normal;

public class ConstructorExample<T> {

	Long id;
	String name;
	T value;

	public ConstructorExample() {
	}

	private ConstructorExample(T value) {
		if (value == null) {
			throw new NullPointerException("value");
		}
		this.value = value;
	}

	public static <T> ConstructorExample<T> of(T value) {
		return new ConstructorExample<>(value);
	}

	protected ConstructorExample(Long id, String name, T value) {
		if (value == null) {
			throw new NullPointerException("value");
		}
		this.id = id;
		this.name = name;
		this.value = value;
	}
}