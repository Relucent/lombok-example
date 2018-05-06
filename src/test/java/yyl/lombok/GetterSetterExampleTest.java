package yyl.lombok;

import java.lang.reflect.Method;

public class GetterSetterExampleTest {

	public static void main(String[] args) {
		Class<?> type = GetterSetterExample.class;
		for (Method method : type.getMethods()) {
			System.out.println(method);
		}
	}

}
