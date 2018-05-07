package yyl.lombok;

import lombok.SneakyThrows;

public class SneakyThrowsExample {

	@SneakyThrows
	public String toString(byte[] bytes) {
		return new String(bytes, "UTF-8");
	}

	@SneakyThrows
	public byte[] toBytes(String value) {
		return value.getBytes("UTF-8");
	}
}
