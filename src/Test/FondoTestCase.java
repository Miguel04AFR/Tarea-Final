package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LogicaClases.CajeroAutomatico;
import LogicaClases.Fondo;

public class FondoTestCase {
	private Fondo cuenta;

	@Before
	public void setUp() throws Exception {
		this.cuenta=new Fondo("Juan","Pedro",50,5000,10);
	}

	@After
	public void tearDown() throws Exception {
		this.cuenta=null;
	}

	@Test
	public void testSalarioDepositado1() {
		this.cuenta=new Fondo("Juan","Pedro",50,9000,10);
		int cpE1=9000;
		int cpP1=20;
		 assertEquals(1800, this.cuenta.SalarioDepositado(cpE1, cpP1), 0.001);
	}
	
	@Test
	public void testSalarioDepositado2() {
		this.cuenta=new Fondo("Juan","Pedro",50,500,10);
		int cpE2=500;
		int cpP2=20;
		 assertEquals(100, this.cuenta.SalarioDepositado(cpE2, cpP2), 0.001);
	}
	
	
	@Test
	public void testSalarioDepositado3() {
		this.cuenta=new Fondo("Juan","Pedro",50,200,10);
		int cpE3=200;
		int cpP3=20;
		 assertEquals(40, this.cuenta.SalarioDepositado(cpE3, cpP3), 0.001);
	}

}
