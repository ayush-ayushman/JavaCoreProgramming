public class count
{
 public static void main(String [] args)
 {
   String st="Rama And Laxamana";
   char ch[]=st.toCharArray();
   int i=0;
   String h="";
   String k="";
   while(i<ch.length)
   {
     if(ch[i]!=' ')
         k=k+ch[i];
     else
     {
        h=h+count(k);
        k="";
         
     } 
     i++; 
      
   }
   h=h+count(k);
   System.out.println(h);
 }
 public static String count(String l)
 {
    char t[]=l.toCharArray();
    String k="";
    for(int i=t.length-1;i>=0;i--)
    {
      k=k+t[i];
    }
    k=k+' ';
    return k;
    
 }
    
}