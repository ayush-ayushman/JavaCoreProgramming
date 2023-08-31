public class higcon
{
  public static void main(String [] args)
  {
    int ar[]={21,12,15,32,16,17,22};
    int big=ar[0]+ar[1];
    for(int l=1;l<ar.length-1;l++)
    {
      if(big<(ar[l]+ar[l+1]))
              big=ar[l]+ar[l+1];
    }
    System.out.println(big);
  }
  
}