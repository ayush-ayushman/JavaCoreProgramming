public class gcd
{
  public static void main(String [] args)
  {
    int l1=6;
    int k=8;
    int m=6;
    int n=8;
    int r=0;
    while(m>0)
    {
       r=n%m;
       n=m;
       m=r;
    }
    System.out.println("gcd=" +n);
    int l=(l1*k)/n;
    System.out.println("hcd=" +l);
  }
}
       