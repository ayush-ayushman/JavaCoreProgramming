public class slast
{
  public static void main(String [] args)
  {
    String st1="3306";
    char ch1[]=st1.toCharArray();
    int sum=0;
    int p=1;
    for(int i=ch1.length-1;i>=0;i--)
    {
       sum=sum+(int)(ch1[i]-48)*p;
       p=p*10;
    }
    System.out.println(sum);
  }
}