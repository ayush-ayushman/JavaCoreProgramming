public class arm
{
  public static void main(String [] args)
  {
     int n=373;
     int l=n;
     int s=call(n);
     int w=0;
     while(n!=0)
     {
        int s1=n%10;
        w=w+pay(s1,s);
        n=n/10;
     }
     if(w==l)
        System.out.println("arm number");
     else
        System.out.println("not arm number");
     
  }
  public static int call(int h)
  {
    int count=0;
    while(h !=0)
    {
       h=h/10;
       count++;
    }
    return count;
  }
  public static int pay(int n,int m)
  {
     int sum=1;
     for(int i=0;i<m;i++)
     {
        sum=sum*n;
     }
     return sum;
  }
  
}