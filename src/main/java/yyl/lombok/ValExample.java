package yyl.lombok;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.val;

public class ValExample {

	public static void main(String[] args) {
		example01();
		example02();
	}

	public static void example01() {
		val example = new ArrayList<String>();
		example.add("Hello, World!");
		System.out.println(example);
	}

	public static void example02() {
		val map = new HashMap<Integer, String>();
		map.put(0, "hello");
		map.put(1, "world");
		for (val entry : map.entrySet()) {
			System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}
