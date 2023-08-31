public class primepalin
{
  public static void main(String [] args)
  {
    int n=314;
    int i;
    for( i=2;i<n;i++)
    {
      if(n%i==0)
           break;
    }
    if(i==n)
    {
        int y=call(i);
        if(y==i)
            System.out.println("prime palindrom");
    }
    else
       System.out.println(" not a prime palindrom");
  }
  public static int call(int y)
  {
    int sum=0;
    while(y>0)
    {
      int h=y%10;
      y=y/10;
      sum=sum*10+h;
    }
    return sum;
  }
}
          