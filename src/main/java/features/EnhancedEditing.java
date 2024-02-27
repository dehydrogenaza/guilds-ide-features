package features;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

class EnhancedEditing {
  void extraEditorShortcuts() {
    //CTRL + W == smart expand selection around caret
    //CTRL + SHIFT + W == smart shrink selection
    //bonus: CTRL + P == show parameters hint
    complicatedMethod(Map.of("key", List.of("val1", "val2")), in -> {
      int res = in + 1;
      return Integer.toString(res);
    });
  }

  void complicatedMethod(Map<String, List<String>> mapOfLists, Function<Integer, String> lambda) {
    //CTRL + Y == delete entire line
    //unnecessary comment

    //CTRL + D == duplicate
    //bonus: CTRL + X/C do not require selection!
    String a = "a";
  }
}
