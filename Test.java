public class Test {
  private String sure;
  
  public Test(String what) {
    this.sure = what;
  }

  @Override
  public String toString() {
    return String.format("%s", sure);
  }
}