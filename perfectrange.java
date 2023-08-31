import java.util.*;
public class perfectrange
{
  public static void main(String [] args)
  {
    int x=100,j;
   for(j=1;j<=100;j++)
   {
    int sum=0;
    for(int i=1;i<j;i++)
    {
       if(j%i==0)
          sum=sum+i;
          
    }
    if(j==sum)
    {
       System.out.println(sum); 
       sum=0;
    }
  
   }
 }
}