package yyl.normal;

public final class ValueExample {

	private final Long id;
	private final String name;
	private String value;

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ValueExample))
			return false;
		ValueExample other = (ValueExample) o;
		Object this$id = getId();
		Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id))
			return false;
		Object this$name = getName();
		Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
			return false;
		Object this$value = getValue();
		Object other$value = other.getValue();
		return this$value == null ? other$value == null : this$value.equals(other$value);
	}

	public int hashCode() {
		int PRIME = 59;
		int result = 1;
		Object $id = getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		Object $name = getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		Object $value = getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		return result;
	}

	public String toString() {
		return "ValueExample(id=" + getId() + ", name=" + getName() + ", value=" + getValue() + ")";
	}

	public ValueExample(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
