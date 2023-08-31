public class fcount
{
  public static void main(String [] args)
  {
    int h[]={11,2,11,11,8,11,3,3};
    int count;
    for(int i=0;i<h.length;i++)
    {
       count=0;
       for(int j=0;j<h.length;j++)
       {
            if(j<i&&h[i]==h[j])
                  break;
         
            if(h[i]==h[j])
                 count++;
           
       }
        if(count!=0)
         System.out.println(count);
    }
     
  }
}
