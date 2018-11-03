import java.util.*;

public class ShapeMain 
{
  public static void main(String []args)
  {
	  double d1,d2;
	  Scanner s =  new Scanner(System.in);
	  System.out.println("Enter The Dimensions: ");
	  d1 = s.nextDouble();
	  d2 = s.nextDouble();
	  Rectangle obj = new Rectangle(d1,d2);
	  System.out.println("Area of the Rectangle is:" + obj.area());
  }
}
