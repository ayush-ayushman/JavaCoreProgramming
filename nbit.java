public class nbit
{
  public static void main(String [] args)
  {
    int x[]={7,11,13,17,22,30,90,37};
    int l=0;
    for(int i=0;i<x.length;i++)
    {
      l=call(x[i]);
      if(l==1)
      {
        System.out.println(x[i]);
      }
 
    }    
  }
  public static int call(int l)
  {
     int i;
     for( i=2;i<l;i++)
     {
       if(l%i==0)
           break;
     }
     if(i==l)
         return 1;
     return -1;
  }
}