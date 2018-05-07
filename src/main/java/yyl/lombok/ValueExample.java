package yyl.lombok;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

@RequiredArgsConstructor
@Value
public class ValueExample {
	private Long id;
	private String name;
	private @NonFinal String value;
}
