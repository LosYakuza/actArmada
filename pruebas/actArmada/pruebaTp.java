package actArmada;

import static org.junit.Assert.*;


import org.junit.Test;

public class pruebaTp {

	@Test
	public void test() {
		Armada a = new Armada();
		
		Soldado s1 = new Soldado("Casanova", 1, 2, TipoSoldado.Hoplital);
		Soldado s2 = new Soldado("Casanova", 2, 2, TipoSoldado.Hoplital);
		Soldado s3 = new Soldado("Ituza", 2, 3, TipoSoldado.Caballero);
		
		a.agregar(s1);
		a.agregar(s3);
		a.agregar(s2);
		
		assertEquals(a.formacionTres().get(0), s1);
		assertEquals(a.formacionTres().get(1), s2);
		assertEquals(a.formacionTres().get(2), s3);
		
		assertEquals(a.representantes().size(), 2);
		
		
		assertEquals(s3, a.agrupar().get(TipoSoldado.Caballero).get(0));
		assertEquals(s1, a.agrupar().get(TipoSoldado.Hoplital).get(0));
		assertEquals(s2, a.agrupar().get(TipoSoldado.Hoplital).get(1));
	}

}
