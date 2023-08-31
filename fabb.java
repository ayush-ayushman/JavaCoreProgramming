public class fabb
{
  public static void main(String [] args)
  {
      int x=10;
       int a=1;
       int b=1;
       int k=3;
       int n=10;
       int c=0;
       while(k<=10)
       {
         c=a+b;
         a=b;
         b=c;
         k++;
       }
       System.out.println(c);
   }
}
  