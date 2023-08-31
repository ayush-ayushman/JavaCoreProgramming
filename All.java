import java.util.*;
public class All
{
  public static void main(String [] args)
  {
    String st="0123456789ABCDEF";
    char ch[]=st.toCharArray();
    String p="";
    Scanner op=new Scanner(System.in);
    int n=op.nextInt();
    System.out.println("enter the base");
    int b=op.nextInt();
    while(n>0)
    {
      int d=n%b;
      n=n/b;
      p=ch[d]+p;
    }
     System.out.println(p);
  }
  
}