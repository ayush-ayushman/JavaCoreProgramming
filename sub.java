public class sub
{
  public static void main(String [] args)
  {
    String st1="AnaghaAyush";
    String st2="Ayush";
    char x1[]=st1.toCharArray();
    char x2[]=st2.toCharArray();
    int found=0;
    for(int i=0;i<x1.length;i++)
    {
      
      int j=0,k=i;
      while(j<x2.length&&k<x1.length&&(x1[k]==x2[j]))
      {
        
            
            j++;
            k++;
            
      
        
      }
      if(j==x2.length)
      { 
         found++; 
         System.out.println("found String");
      }
     
     
    }
    if(found==0)
      System.out.println(" not found String");
     
  }
   
}