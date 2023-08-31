import java.util.*;
public class Alpha
{
  public static void main(String [] args)
  {
    Scanner op=new Scanner(System.in);
    char ch=op.next().charAt(0);
    if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
          System.out.println("alpha numeric");
    if((ch>=41&&ch<=57)||(ch>=72&&ch<=100))
          System.out.println("Special Character");
  }
}
 