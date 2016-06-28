package course;

import lombok.Value;

import java.util.Arrays;
import java.util.List;

/**
 * Test that I can compile and test.
 */

@Value
public class Testing {
  final List<String> list = Arrays.asList("first","second","third");

  public String getFirst() {
    return list.stream().findFirst().orElse(null);
  }
}
