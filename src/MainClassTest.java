import org.junit.Test;

public class MainClassTest extends MainClass {

  private String Hello;

  @Test
  public String testGetClassString() {
    String class_string = this.getClassString("Hello, world");
    if (class_string == Hello) {
      return this.getClassString("Hello, world");

    }
    return class_string;
  }
}