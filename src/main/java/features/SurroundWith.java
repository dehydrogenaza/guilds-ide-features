package features;

class SurroundWith {
  void someMethod() {
    //CTRL + ALT + T == surround with construct
    // --> 6 == try/catch
    // --> 2 == if/else
    someMethodThatThrows();

    //do thing
  }

  void someMethodThatThrows() throws Exception {
    throw new Exception();
  }
}
