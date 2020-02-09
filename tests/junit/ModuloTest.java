package junit;

import junit.framework.TestCase;
import pass.Modulo;

public class ModuloTest extends TestCase {
	private Modulo modulo;
	
	protected void setUp() throws Exception {
		super.setUp();
		modulo = new Modulo();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testModule() {
		this.assertEquals(modulo.module(6, 2), 0);
		this.assertEquals(modulo.module(5, 3), 2);
		this.assertEquals(modulo.module(11, 3), 2);
	}
}
