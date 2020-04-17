import org.junit.Test;

public class MainClass {
  int a = 14;
  int b = 11;
  @Test
  public void testgetLocalNumber() {
    int a= this.getLocalNumber();
    if (a==14){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }
  public int getLocalNumber(){
    return 14;
  }
}
