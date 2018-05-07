package yyl.normal;

import lombok.Lombok;

public class SneakyThrowsExample {

	public String toString(byte[] bytes) {
		try {
			return new String(bytes, "UTF-8");
		} catch (Throwable $ex) {
			throw Lombok.sneakyThrow($ex);
		}
	}

	public byte[] toBytes(String value) {
		try {
			return value.getBytes("UTF-8");
		} catch (Throwable $ex) {
			throw Lombok.sneakyThrow($ex);
		}
	}
}