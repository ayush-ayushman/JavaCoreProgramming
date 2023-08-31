public class diamond
{
  public static void main(String [] args)
  {
    int n=4;
    for(int i=1;i<=4;i++)
    {
      for(int j=n-i;j>0;j--)
      {
        System.out.print(" ");
      }
      for(int j1=1;j1<=i;j1++)
      {
        System.out.print("*");
      }
      for(int j1=1;j1<i;j1++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=1;i<n;i++)
    {
    
      for(int j=1;j<=i;j++)
      {
       
         System.out.print(" ");
      }
      for(int k=n-i-1;k>0;k--)
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