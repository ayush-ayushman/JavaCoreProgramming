public class serstring
{
  public static void  main(String [] args)
  {
    String st="Ayush Ayushman NewDelhi";
    String l="Ayushman";
    char ch[]=st.toCharArray();
    String p="";
    int i;
    int pos=0;
    for(i=0;i<ch.length;i++)
    {
      if(ch[i] !=' ')
      {
        p=p+ch[i];
      }
      else if(ch[i]==' ')
      {
        pos=call(l,p);
        if(pos==1)
        {
              break;
        }
        p="";
      }
  
    }
    pos=call(l,p);
    if(pos==-1)
       System.out.println("not found"); 
    else if(pos==1)
       System.out.println("found");  
  }
  public static int call(String x,String y)
  {
     if(x.equals(y))
          return 1;
     return -1;
  }
 }
      
      