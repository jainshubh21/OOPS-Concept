
public class FinalDemo2 extends FinalDemo1 
{
	public FinalDemo2(double r)
	{
		super(r);
	}
	
	public static void main(String args[])
	{
		
		FinalDemo1 object = new FinalDemo2(10);
		System.out.println("Area is:" +object.area());
	}

}
