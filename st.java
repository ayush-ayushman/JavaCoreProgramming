public class st
{
  public static void main(String [] args)
  {
    int n=4;  
    for(int i=1;i<=n;i++)
    {
    
      for(int j=0;j<i-1;j++)
      {
       
         System.out.print(" ");
      }
      for(int k=n-i;k>=0;k--)
      {
       
         System.out.print("*");
      }
      for(int s=n-i;s>0;s--)
      {
        System.out.print("*");
      }
      
      System.out.println();
    }
    
  }
}