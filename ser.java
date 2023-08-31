public class ser
{
  public static void main(String [] args)
  {
    int l[]={78,45,60,40,90};
    int lpos=l[0];
    int bpos=l[0];
    for(int i=1;i<l.length;i++)
    {
      if(lpos>l[i])
      {
          lpos=l[i];
         
      }
      if(bpos<l[i])
      {
         bpos=l[i];
      }
   
    }
    System.out.println(lpos);
    System.out.println(bpos);
  }
}
    