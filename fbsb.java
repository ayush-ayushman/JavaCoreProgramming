public class fbsb
{
  public static void main(String [] args)
  {
     int x[]={25,12,14,56,22,23,13};
     int fbig=x[0];
     int sbig=x[1];
     for(int i=1;i<x.length;i++)
     {
        if(x[i]>fbig)
        {
           sbig=fbig;
           fbig=x[i];
        }
        else if(x[i]>sbig&&x[i]<fbig)
        {
          sbig=x[i];
        } 
     }
     System.out.println(fbig);
     System.out.println(sbig);
      
      
  }
}
           
             