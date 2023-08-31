import java.util.*;
public class mat
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
    for(int p=0;p<2;p++)
    {
      for(int q=0;q<2;q++)
      {
        System.out.println(x[p][q]);
      }
    }
    for(int p1=0;p1<2;p1++)
    {
      int frb=x[p1][0];
      for(int q1=0;q1<2;q1++)
      {
        if(frb<x[p1][q1])
        {
           frb=x[p1][q1];
        }
      }
      System.out.println(frb);
    }
    for(int p2=0;p2<2;p2++)
    {
      int rrb=x[0][p2];
      for(int q2=0;q2<2;q2++)
      {
        if(rrb<x[q2][p2])
        {
           rrb=x[q2][p2];
        }
      }
      System.out.println(rrb);
    }
    
  }
}
    