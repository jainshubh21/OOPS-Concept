
public class ConstructorDemo1 extends ConstructorDemo
{
  public ConstructorDemo1()
  {
	  System.out.println("In Derived Class Default Constructor");
  }
  
  public ConstructorDemo1(int val)
  {
	  super(val);
	  System.out.println("In Derived Class Parameterised Constructor");
  }
  
  public static void main(String []args)
  {
	  ConstructorDemo1 obj = new ConstructorDemo1();
	  ConstructorDemo1 obj1 = new ConstructorDemo1(10);
	  
  }
}
