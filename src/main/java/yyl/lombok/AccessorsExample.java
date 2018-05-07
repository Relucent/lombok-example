package yyl.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class AccessorsExample {

	private String name;
	private String value;

}
