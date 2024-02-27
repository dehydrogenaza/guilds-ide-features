package features;

public class ExtractSymbol {
  void foo() {
    //CTRL + ALT + C == extract constant
    //CTRL + ALT + M == extract method
    String something = "SOMETHING";
    //CTRL + ALT + V == extract variable
    String smallThing = something.replace("SOME", "OTHER").toLowerCase();

    System.out.println(smallThing);
  }
}
