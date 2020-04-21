import org.junit.Test;

public class MainClassTest extends MainClass {

  @Test
  public void testGetClassNumber() {
    int class_number = this.getClassNumber(20);
    if (class_number > 45) {
      System.out.println("Incorrect." + " " + class_number + " " + "should be less than 45");
    } else {
      if (class_number < 45) {
        System.out.println("Correct." + " " + class_number + " " + "should be less than 45");
      }
    }
  }
}