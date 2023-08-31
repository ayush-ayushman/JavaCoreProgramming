public class spalin
{
  public static void main(String [] args)
  {
    String st="Ayush";
    String p=rev(st);
    String m=sor(st);
    String n=sor(p);
    if(m.equals(n))
        System.out.println("palindrom");
    else
       System.out.println(" not palindrom");
  }
  public static String rev(String k1)
  {
      String l="";
      char ch[]=k1.toCharArray();
      for(int k=ch.length-1;k>=0;k--)
      {
         l=l+ch[k];
      }
      return l;
  }
  public static String sor(String r)
  {
      String s="";
      char ch[]=r.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
          if(ch[i]>=65&&ch[i]<=90)
       {
          s=s+(char)(ch[i]+32);
       }
       else if(ch[i]>=97&&ch[i]<=122)
       {
         s=s+ch[i];
       }
      }
      return s;
  }
       
}