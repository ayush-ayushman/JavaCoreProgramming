public class exchange
{
 public static void main(String [] args)
 {
    int ar[]={21,12,15,32,16,17};
    int k=ar.length/2;
    for(int i=0;i<k;i++)
    {
      int temp;
      temp=ar[i];
      ar[i]=ar[ar.length-1-i];
      ar[ar.length-1-i]=temp;
    }
    for(int k1=0;k1<k/2;k1++)
    {
       int temp;
       temp=ar[k1];
       ar[k1]=ar[k-1-k1];
       ar[k-1-k1]=temp;
    }
    for(int s=0;s<k/2;s++)
    {
      int tem;
      tem=ar[k+1+s];
      ar[k+1+s]=ar[ar.length-1-s];
      ar[ar.length-1-s]=tem;
    }
    for(int j=0;j<ar.length;j++)
    {
      System.out.println(ar[j]);
    }
 }
}