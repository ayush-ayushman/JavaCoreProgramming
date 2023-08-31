import java.util.*;
public class matsum
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
    for(int p=0;p<2;p++)
    {
      int rsum=0;
      for(int q=0;q<2;q++)
      {
        rsum=rsum+x[p][q];
      }
      System.out.println(rsum);
    }
     for(int p=0;p<2;p++)
    {
      int csum=0;
      for(int q=0;q<2;q++)
      {
        csum=csum+x[q][p];
      }
      System.out.println(csum);
    }
  }
}