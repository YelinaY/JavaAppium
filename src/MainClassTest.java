import org.junit.Test;

public class MainClassTest extends MainClass{
  int a =14;
  @Test
  public void testGetLocalNumber(){
   int a = this.getLocalNumber(14);
   if (a==14){
     System.out.println("True");
   }else {
     System.out.println("False");
   }
    System.out.println(a);
  }
}
