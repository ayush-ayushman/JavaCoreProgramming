public class posniv
{
  public static void main(String [] args)
  {
    int x[]={7,2,9,11,3};
    int fs=x[0];
    int ss=x[1];
    for(int k=1;k<x.length;k++)
    { 
       if(fs>x[k])
       {
         ss=fs;
         fs=x[k];
       }
       if(ss>x[k] && fs<x[k])
       {
         ss=x[k];
       }
     
    }
    System.out.println(fs);
    System.out.println(ss);
  }
  
}