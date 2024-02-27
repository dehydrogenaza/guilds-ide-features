package features;

import java.util.List;
import java.util.function.Supplier;

public class MinorTimeSavers {
  //CTRL + SHIFT + M == move to matching brace
  //SHIFT + ENTER == smart enter
  Supplier<Integer> foo() {
    return () -> {
      //do sth
      int a = 2;
      int b = 2;
      return a + b;
    };
  }

  //CTRL + SHIFT + ENTER == complete statement
  void incomplete(List<String> list)
}
