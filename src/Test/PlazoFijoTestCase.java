package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LogicaClases.Fondo;
import LogicaClases.PlazoFijo;

public class PlazoFijoTestCase {

	private PlazoFijo cuenta;

	@Before
	public void setUp() throws Exception {
		this.cuenta=new PlazoFijo("Juan","Pedro",50);
	}

	@After
	public void tearDown() throws Exception {
		this.cuenta=null;
	}

	@Test
	public void testCalcularInteresCasoNormal() {
		this.cuenta=new PlazoFijo("Juan","Pedro",50);
		String cpFI1="23-ago-2023";
		String cpFF2="25-feb-2025";
		double resultadoEsperado = 100; //c�lculo esperado
		assertEquals("Inter�s calculado incorrectamente", resultadoEsperado, cuenta.CalcularInteres(cpFF2, cpFI1), 0.001);
	}
	
	public void testCalcularInteresCasoLimite() {
		String cpFI1 = "01-ene-2023";
		String cpFF2 = "01-ene-2023";
		double resultadoEsperado = 0.025; 
		assertEquals("Inter�s calculado incorrectamente", resultadoEsperado, cuenta.CalcularInteres(cpFF2, cpFI1), 0.001);
	}

	@Test
	public void testCalcularInteresCasoErroneo() {
		String cpFI1 = "abc-2023";
		String cpFF2 = "25-feb-2025";
		try {
			cuenta.CalcularInteres(cpFF2, cpFI1);
			fail("Se espera una excepci�n por formato incorrecto");
		} catch (Exception e) {
			assertTrue("Excepci�n esperada", true);
		}
	}
}
