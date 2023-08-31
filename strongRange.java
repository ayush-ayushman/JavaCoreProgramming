public class strongRange
{
 public static void main(String [] args)
 {
     int i=1;
     int sum=0;
     while(i<=145)
     {
        sum=call(i);
        if(sum==i)
            System.out.println(sum);
        i++;
        sum=0;
     }
     
 }
     public static int call(int k)
     {
        
        int so=0;
        while(k!=0)
        {
          int y=k%10;
          so=so+caller(y);
           k=k/10;
        }
        return so;
      }
      public static int caller(int p)
      {
        int p1=1;
        for(int k=1;k<=p;k++)
        {
          p1=p1*k;
        }
         return p1;
      }
}