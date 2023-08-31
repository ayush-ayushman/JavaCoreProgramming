public class Bubble
{
  public static void main(String [] args)
  {
    int x[]={12,89,96,5,88};
    for(int i=0;i<x.length;i++)
    {
      for(int k=0;k<x.length-i-1;k++)
        if(x[k]>x[k+1])
        {
           int temp;
           temp=x[k];
           x[k]=x[k+1];
           x[k+1]=temp;
        }
           
     }
    for(int j=0;j<x.length;j++)
   
      System.out.print(x[j]);
  }
}
