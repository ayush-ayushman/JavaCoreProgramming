public class lsearch
{
  public static void main(String [] args)
  {
    int x[]={45,89,32,10,80};
    int l=10;
    int found=0;
    for(int i=0;i<x.length;i++)
    {
      if(x[i]==l)
      {
         found++;
         System.out.println("found" +i);
      }
    }
    if(found==0)
      System.out.println("not found");
  }
}