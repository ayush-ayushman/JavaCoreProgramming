public class Hd
{
  public static void main(String [] args)
  {
    
     int n=7;
     for(int i=0;i<n;i++)
     {
       for(int j=0;j<n-i-1;j++)
       {
         System.out.print(" ");
       }
       for(int j1=0;j1<=i;j1++)
       {
        
          System.out.print("*");
       }
       System.out.println();
    }
    
  }
}