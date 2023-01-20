package day2;


public class Test
{
	private String function(float i, int f)
	{
		return ("gfg");
	}
	private String function(double i, double f)
	{
		return ("GFG");
	}
	public static void main(String[] args)
	{
		Test obj = new Test();
		System.out.println(obj.function(1., 20));    
	}
}

