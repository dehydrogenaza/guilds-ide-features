package features.wrong_package;

class UseRenamedClass {
  RenameAndMove thing = new RenameAndMove();

  public UseRenamedClass() {
    thing.badName();
  }
}
