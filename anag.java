public class anag
{
  public static void main(String [] args)
  {
    String st="ABCDEFghijklmnopkrstuvwxyZ";
    String k=sort(st);
    int t=check(k);
    System.out.println(t);
    
  }
  public static String sort(String k)
  {
     char h[]=k.toCharArray();
     String t="";
     for(int i=0;i<h.length;i++)
     {
        if(h[i]>=65&&h[i]<=90)
               t=t+(char)(h[i]+32);
        else
              t=t+h[i];
     }
     return t;
  }
  public static int check(String p)
  {
     int found=0;
     char r[]=p.toCharArray();
     for(char i='a';i<='z';i++)
     {
       
     }
     return found;
  }
}