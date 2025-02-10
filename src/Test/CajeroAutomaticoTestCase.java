package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LogicaClases.CajeroAutomatico;

public class CajeroAutomaticoTestCase {
	
	private CajeroAutomatico car;
	@Before
	public void setUp() throws Exception {
		this.car=new CajeroAutomatico();
	}

	@After
	public void tearDown() throws Exception {
		this.car=null;
	}

	@Test
	public void testExtraerBilletesSi1() {
		this.car=new CajeroAutomatico();
		int cp1=9000;
		assertEquals(true,this.car.Extraer(cp1));
	}
	@Test
	public void testExtraerBilletesNo2() {
		this.car=new CajeroAutomatico();
		int cp2=11111;
		assertEquals(false,this.car.Extraer(cp2));
	}
	
	@Test
	public void testExtraerBilletesNo3() {
		this.car=new CajeroAutomatico();
		int cp3=-1;
		assertEquals(false,this.car.Extraer(cp3));
	}
}
