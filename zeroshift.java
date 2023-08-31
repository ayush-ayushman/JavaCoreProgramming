public class zeroshift
{
  public static void main(String [] args)
  {
    int x[]={0,12,12,0};
    for(int i=0;i<x.length;i++)
    {
       for(int j=0;j<x.length-i-1;j++)
       {
         if(x[j]>0)
         {
           int temp;
           temp=x[j];
           x[j]=x[j+1];
           x[j+1]=temp;
         }
       }
       
    }
    for(int j=0;j<x.length;j++)
    {
       System.out.print(x[j]);
    }
  }
}  
       