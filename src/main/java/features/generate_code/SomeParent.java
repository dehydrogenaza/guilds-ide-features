package features.generate_code;

public class SomeParent {
  protected final Boolean hi;
  public SomeParent(Boolean hi) {
    this.hi = hi;
  }

  public SomeParent() {
    this.hi = false;
  }

  String hello() {
    return "hello";
  }
}
