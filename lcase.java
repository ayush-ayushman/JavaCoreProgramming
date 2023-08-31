public class lcase
{
  public static void main(String [] args)
  {
    String st="PraMoD ReddY GoPi RedDY";
    char ch[]=st.toCharArray();
    String l="";
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]>=65&&ch[i]<=90)
           l=l+(char)(ch[i]+32);
      else
         l=l+(char)(ch[i]-32);
    }
    System.out.println(l);
  }
}