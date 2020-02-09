package junit;

import junit.framework.TestCase;
import pass.UnaryPlus;

public class UnaryPlusTest extends TestCase 
{
	private UnaryPlus unaryPlus;
	
	protected void setUp() throws Exception
	{
		super.setUp();
		unaryPlus = new UnaryPlus();
	}
	
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	public void testUnaryPlus()
	{
		this.assertEquals(unaryPlus.unaryPlus(4), 4);
		this.assertEquals(unaryPlus.unaryPlus(0), 0);
		this.assertEquals(unaryPlus.unaryPlus(-1), -1);
		this.assertEquals(unaryPlus.unaryPlus(3+4), 7);
		this.assertEquals(unaryPlus.unaryPlus(3-5), -2);
	}
}
