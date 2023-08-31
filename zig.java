public class zig
{
  public static void main(String [] args)
  {
    int ar1[]={12, 13, 23, 15, 11, 16};
    int ar2[]={53,26,23,15,18,13,23,45};
    int z[]=new int[ar1.length+ar2.length];
    int m=0,n=0,i;
    for( i=0;i<z.length;)
    {
       if(m<ar1.length)
       {
          z[i]=ar1[m];
          m++;
          i++;
       }
       if(n<ar2.length)
       {
          z[i]=ar2[n];
          n++;
          i++;
       }
    }
 
       
       
   
    for(int i1=0;i1<z.length;i1++)
    {
      System.out.println(z[i1]);
    }
    
  }
}