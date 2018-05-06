package yyl.normal;

import java.util.Arrays;

public class EqualsAndHashCodeExample {

	private Integer id;
	private String name;
	private String[] values;

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof EqualsAndHashCodeExample)) {
			return false;
		}
		EqualsAndHashCodeExample other = (EqualsAndHashCodeExample) o;
		if (!other.canEqual(this)) {
			return false;
		}
		Object this$id = this.id;
		Object other$id = other.id;
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
			return false;
		}
		Object this$name = this.name;
		Object other$name = other.name;
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
			return false;
		}
		return Arrays.deepEquals(this.values, other.values);
	}

	protected boolean canEqual(Object other) {
		return other instanceof EqualsAndHashCodeExample;
	}

	public int hashCode() {
		int PRIME = 59;
		int result = 1;
		Object $id = this.id;
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		Object $name = this.name;
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		result = result * PRIME + Arrays.deepHashCode(this.values);
		return result;
	}
}