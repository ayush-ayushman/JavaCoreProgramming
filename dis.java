public class dis
{
  public static void main(String [] args)
  {
     int x1[]={42,15,21,23,17,19};
     int x2[]={19,23,21,52,11,10};
     for(int i=0;i<x1.length;i++)
     {
       int j=0,k=i;
       while(j<x2.length)
       {
          if(x1[k]==x2[j]) 
               break;
          j++;
        }
        if(j==x2.length)
        {
            System.out.println(x1[k]);
        }
      }
      for(int i=0;i<x2.length;i++)
      {
       int j=0,k=i;
       while(j<x1.length)
       {
          if(x2[k]==x1[j]) 
               break;
          j++;
        }
        if(j==x1.length)
        {
            System.out.println(x2[k]);
        }
      }
    }
}