package yyl.normal;

public class AccessorsExample {

	private String name;
	private String value;

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public AccessorsExample setName(String name) {
		this.name = name;
		return this;
	}

	public AccessorsExample setValue(String value) {
		this.value = value;
		return this;
	}
}
