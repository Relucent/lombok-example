package yyl.normal;

import java.util.Arrays;

public class ToStringExample {
	private int id;
	private String name;
	private String[] values;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getValues() {
		return this.values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	public String toString() {
		return "ToStringExample(id=" + getId() + ", name=" + getName() + ", values=" + Arrays.deepToString(getValues())
				+ ")";
	}
}