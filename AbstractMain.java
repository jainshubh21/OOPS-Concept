
public class AbstractMain
{
	public static void main(String arg[])
	{
	AbstractShape abs = new AbstractRectangle(10,20);
	System.out.println("Area of the rectangle is:" + abs.area());
	//abs.display();   //It is a amethod of rectangle class....
	
	AbstractRectangle absr = (AbstractRectangle)abs;  //Downcasting.....
	absr.display();
	}

}
