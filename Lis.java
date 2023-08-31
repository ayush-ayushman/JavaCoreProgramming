import java.util.*;
class person
{
  String y;
  int p;
  person(String k,int l)
  {
    y=k;
    p=l;
  }
  
}

public class Lis
{
  public static void main(String [] args)
  {
    person a=new person("Ayush",7);
    person b=new person("Anagha",6);
    ArrayList<person> op=new ArrayList<person>();
    op.add(a);
    op.add(b);
    for(int i=0;i<op.size();i++)
    {
      person p=op.get(i);
      System.out.println(p.y);
      System.out.println(p.p);
      
    }
  }
}