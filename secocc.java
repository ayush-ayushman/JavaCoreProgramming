public class secocc
{
  public static void main(String [] args)
  {
    int ar[]={22,11,23,11,15,19,11};
    int k=11;
    int count=0;
    int i;
    for( i=0;i<ar.length;i++)
    {
      if(ar[i]==k)
          count++;
      if(count==2)
      {
           System.out.println(i);
           break;
      }
    }
  }
}
    
    
      