package calculatorhm;

import static org.junit.Assert.*;

import org.junit.Test;

public class cal {
	CalculatorhmModal m=new CalculatorhmModal();	
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
	@Test
	public void testadd() {
		//fail("Not yet implemented");
		int x=c.m.add(4,5);
		assertEquals(9,x);
	}
	@Test
	public void testmod() {
		//fail("Not yet implemented");
		int x=c.m.mod(4,5);
		assertEquals(4,x);
	}
	@Test
	public void testsquare() {
		//fail("Not yet implemented");
		int x=c.m.squer(-5);
		assertEquals(0,x);
	}


}
