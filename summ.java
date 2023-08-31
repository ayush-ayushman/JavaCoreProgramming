public class summ
{
  public static void main(String [] args)
  {
    int z[]={11,2,11,11,8,3,3};
    int pos=z[0];
    int sum=pos;
    
    for(int l=1;l<z.length;l++)
    {
       if(pos<z[l])
       {
           pos=z[l];
       }
    }
    for(int i=0;i<z.length;i++)
    {
      if(z[i]==pos)
      {
          continue;
      }
      else
      {
         sum=sum+z[i];
      }
    }
    System.out.println(sum);
    
  }
}
  