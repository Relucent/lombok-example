package yyl.lombok;

public class ToStringExampleTest {
	public static void main(String[] args) {
		ToStringExample example = new ToStringExample();
		example.setId(1);
		example.setName("hello");
		example.setValues(new String[] { "a", "b", "c" });
		System.out.println(example);
	}
}
