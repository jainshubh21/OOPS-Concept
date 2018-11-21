
public class FinalDemo1 
{
	double rad;
	public final double pi ;
	
	public FinalDemo1(double rad)
	{
		pi = 3.141;
		this.rad = rad;
	}
	public final double area() 
	{
		return rad*rad*pi;
		
	}

}
