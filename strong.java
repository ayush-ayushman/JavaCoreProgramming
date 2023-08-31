public class strong
{
  public static void main(String [] args)
  {
     int x=148;
     int y=x;
     int sum=0;
     while(x>0)
     {
       int l=x%10;
       x=x/10;
       sum=sum+call(l);
     }
     if(sum==y)
         System.out.println("strong number");
     else
        System.out.println(" not strong number");
     
   }
   public static int call(int y)
   {
     int s=1;
     int p=s;
     if(y==0)
         return 1;
     else
     {
       for(int k=1;k<=y;k++)
       {
          p=p*k;
       }
       return p;
     
     }
  }
}