package yyl.normal;

public class DataExample {

	Long id;
	String name;

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof DataExample))
			return false;
		DataExample other = (DataExample) o;
		if (!other.canEqual(this))
			return false;
		Object this$id = getId();
		Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id))
			return false;
		Object this$name = getName();
		Object other$name = other.getName();
		return this$name == null ? other$name == null : this$name.equals(other$name);
	}

	protected boolean canEqual(Object other) {
		return other instanceof DataExample;
	}

	public int hashCode() {
		int PRIME = 59;
		int result = 1;
		Object $id = getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		Object $name = getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		return result;
	}

	public String toString() {
		return "DataExample(id=" + getId() + ", name=" + getName() + ")";
	}

}
