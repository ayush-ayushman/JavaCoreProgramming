public class facrange
{
  public static void main(String [] args)
  {
     int pro=1,k=1;
     while(k<=5)
     {
        for(int i=1;i<=k;i++)
        {
           pro=pro*i;
        }
        System.out.println(pro);
        pro=1;
        k++;
     }
  }
  
}
        