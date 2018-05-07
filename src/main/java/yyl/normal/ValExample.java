package yyl.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ValExample {

	public static void main(String[] args) {
		example01();
		example02();
	}

	public static void example01() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello, World!");
		System.out.println(list);
	}

	public static void example02() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(Integer.valueOf(0), "hello");
		map.put(Integer.valueOf(1), "world");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}
