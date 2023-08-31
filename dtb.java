public class dtb
{
  public static void  main(String [] args)
  {
    int x=469;
    String st="";
    while(x!=0)
    {
      int dig=x%16;
      if(dig>9)
      {
         char l=(char)call(dig);
         st=l+st;
      }
      else
      {
        st=dig+st;
      }
      x=x/16;
     
     }
    System.out.println(st);
  }
  public static int call(int s)
  {
     if(s==10)
         return 65;
     else if(s==11)
         return 66;
     else if(s==12)
         return 67;
     else if(s==13)
         return 68;
     else if(s==14)
         return 69;
     else
         return 70;
  }
     
}
      