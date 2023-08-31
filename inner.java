class A
{
    /*public void call()
    {
      System.out.println("Ayush Ayushman");
    }*/
}
class B
{
  A op=new A()
  { 
    public void call()
    {
      System.out.println("Ayush Ayushman");
    }
  };
}


public class inner
{
  public static void main(String [] args)
  {
    
     B l=new B();
     l.op.call();
  }
}
   