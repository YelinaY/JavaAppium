import org.junit.Test;

public class MainFirstTest6 {
  int a=5;
  int b=11;
  @Test
  public void myFirstTest(){
    int a = 10;
    int b = 15;

    System.out.println(this.a);
    System.out.println(this.b);
    System.out.println(a);
    System.out.println(b);
  }

  public void typeString(){
    System.out.println("Hello from typeString");
  }
}
