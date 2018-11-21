
public class AbstractRectangle extends AbstractShape 
{

	public AbstractRectangle(int d1,int d2)
	{
		super(d1,d2);
	}
	
	public double area()
	{
		return dim1*dim2;
	}
	
	public void display() 
	{
	  	System.out.println("I Am in Display Method");
	}
}
