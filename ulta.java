public class ulta
{
  public static void main(String [] args)
  {
    String st="Rama and Laxamana";
    char [] ch=st.toCharArray();
    String k="";
    int i=0;
    String h="";
    while(i<ch.length)
    {
      if(ch[i]!=' ')
      {
         h=h+ch[i];
      }
      else
      {
        k=rev(h)+k;
        h="";
      }
      i++; 
     
    }
    k=rev(h)+k;
    System.out.println(k);
  }
  public static String rev(String h)
  {
    String t="";
    char ch[]=h.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      t=t+ch[i];
    }
    t=t+" ";
    return t;
  }

}
     
  