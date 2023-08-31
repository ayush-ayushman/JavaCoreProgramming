public class Super
{
  public static void main(String [] args)
  {
    int n=145;
    int l=n;
    int sum=0;
    while(n>0)
    {
       int dig=n%10;
       n=n/10;
       sum=sum+call(dig);
    }
    if(sum==l)
       System.out.println("super number");
    else
      System.out.println(" not super number");
  }
  static int call(int x)
  {
    int z=1;
    for(int k=1;k<=x;k++)
    {
      z=z*k;
    }
    return z;
  }
 
}