public class ucase
{
  public static void main(String [] args)
  {
    String st="ayush ayushman";
    char ch[]=st.toCharArray();
    String l="";
    for(int i=0;i<ch.length;i++)
    {
      if(i==0||(ch[i-1]==' '&&ch[i]!=' '))
           l=l+(char)(ch[i]-32);
      else
         l=l+ch[i];
    }
    System.out.println(l);
  }
}