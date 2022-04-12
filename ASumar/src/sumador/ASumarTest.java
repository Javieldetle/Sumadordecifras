package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ASumarTest {

	@Test
	public void testUnaCifra() {
		ASumar sum1= new ASumar();
		int resultado = sum1.total("5");
		assertEquals("5=5", resultado);
		ASumar sum2= new ASumar();
		int resultado2 = sum2.total("12");
		assertEquals("eso no es un digito ", resultado2);
	}
	@Test
	public void testNegativo() {
		ASumar suma= new ASumar();
		int resultado = suma.total("-5");
		assertEquals("Negativo.Siempre negativo ", resultado);
	}
	
	@Test
	public void concatenaYSuma() {
		ASumar suma= new ASumar();
		int resultado = suma.total("15");
		assertEquals(6, resultado);
	}

}
