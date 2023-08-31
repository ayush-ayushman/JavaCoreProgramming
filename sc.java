public class sc
{
  public static void main(String [] args)
  {
    int n=4;
    for(int i=1;i<=4;i++)
    {
      int k=65;
      for(int j=n-i;j>0;j--)
      {
        System.out.print(" ");
      }
      for(int j1=1;j1<=i;j1++)
      {
        
        System.out.print((char)k);
        k++;
      }
      
      for(int j1=1;j1<i;j1++)
      {
        k=k-2;
        System.out.print((char)k);
        k++;
       
      }
      System.out.println();
    }
    for(int i=1;i<n;i++)
    {
       int l=65;
      for(int j=1;j<=i;j++)
      {
       
         System.out.print(" ");
      }
      for(int k=n-i-1;k>0;k--)
      {
       
         System.out.print((char)l);
         l++;
      }
      for(int s=n-i;s>0;s--)
      {
        System.out.print((char)l);
        l--;
      }
      
      System.out.println();
    }
    
  }
}