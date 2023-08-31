public class Ana
{
  public static void main(String [] args)
  {
    String st1="Mother in law";
    String st2="Hitler woma  n";
    String x=remspace(st1);
    String y=remspace(st2);
    String p1=forsort(x);
    String q1=forsort(y);
    System.out.println(p1);
    System.out.println(q1);
    if(p1.equals(q1))
        System.out.println("anagram");
    else
        System.out.println("not a anagram");
    
   
  }
  public static String remspace(String l)
  {
    String s="";
    char ch[]=l.toCharArray();
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
  public static String forsort(String h)
  {
    char [] x=h.toCharArray();
    String l=new String();
    for(int i=0;i<x.length;i++)
    {
      for(int k=0;k<x.length-i-1;k++)
      {
        if(x[k]>x[k+1])
        {
           char temp;
           temp=x[k];
           x[k]=x[k+1];
           x[k+1]=temp;
        }
           
      }
    }
    String l1=new String(x);
    return l1;
  }
}
