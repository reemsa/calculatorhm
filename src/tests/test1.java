package tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test1 {
	CalculatorhmModal m=new CalculatorhmModal();	
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
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

@Test
	public void testdiv() {
		//fail("Not yet implemented");
		int x=c.m.div(5,0);
		assertEquals(0,x);
	}

}
