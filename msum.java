import java.util.*;
public class msum
{
  public static void main(String [] args)
  {
    int x[][]=new int[2][2];
    Scanner op=new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        x[i][j]=op.nextInt();
      }
    }
    for(int p2=2-1;p2>=0;p2--)
    {
      
      for(int q2=2-1;q2>=0;q2--)
      {
        System.out.println(x[p2][q2]);
      }
      
    }
    
  }
}
    