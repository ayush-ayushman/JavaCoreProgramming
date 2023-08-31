public class btd
{
  public static void main(String []  args)
  {
    String x="1D5";
    int sum=0;
    int pow=1;
    
    char ch[]=x.toCharArray();
    int i=ch.length-1;
    while(i>=0)
    {
      sum=sum+pow*caller((int)ch[i]);
      pow=pow*16;
      i--;
    }
    
    System.out.println(sum);
  }
  public static int caller(int n)
  {
     
     if(n>=65 && n<=69)
           return (n-55);
     else
           return (n-48);
  }
}
  
      