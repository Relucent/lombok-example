package yyl.lombok;

import lombok.NonNull;

public class NonNullExample {

	String name;

	public NonNullExample(@NonNull String name) {
		this.name = name;
	}
}
