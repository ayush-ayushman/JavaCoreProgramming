public class arpalin
{
  public static void main(String [] args)
  {
    int ar[]={232, 12, 78, 898, 34543, 45};
    int count=0;
    for(int i=0;i<ar.length;i++)
    {
      count=count+call(ar[i]);
    }
    System.out.println(count);
  }
  public static int call(int l1)
  {
     int y=l1;
     int l=l1;
     int sum=0;
     while(l>0)
     {
        int l2=l%10;
        l=l/10;
        sum=sum*10+l2;
     }
     if(sum==y)
         return 1;
     return 0;
  }
}
        