public class revarr
{
  public static void main(String [] arr)
  {
   int x[]={10,20,30,40,50};
   int pos=3;
   int y[]=new int[5-1];
   for(int i=0;i<pos;i++)
   {
      y[i]=x[i];
   }
   for(int j=pos+1;j<x.length;j++)
   {
      y[j-1]=x[j];
   }
   for(int l=0;l<y.length;l++)
   {
     System.out.println(y[l]);
   }
  
  }
}
   