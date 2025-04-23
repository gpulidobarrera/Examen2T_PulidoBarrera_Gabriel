package examen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CAJA_NEGRA_GabrielPulidoBarrera {
	
	//VALORES LIMITE
	@Test
	void procesarPedidoLimitePositivo(){ // Compruebo que la funcion procesarPedido pueda operar con el valor maximo permitido.
		Departamento microsoft = new Departamento("microsoft", Double.MAX_VALUE);
		assertTrue(microsoft.procesarPedido(Double.MAX_VALUE));
	}
	@Test
	void procesarPedidoLimiteNegativo(){ // Compruebo que la funcion procesarPedido pueda operar con el valor minimo permitido.
		Departamento microsoftMalvado = new Departamento("microsoftMalvado", Double.MIN_VALUE);
		assertTrue(microsoftMalvado.procesarPedido(Double.MIN_VALUE));
	}
	@Test
	void realizarPedidoLimitePositivo() { //Compruebo que la funcion realizarPedido pueda operar con el valor maximo permitido
		Instituto marte = new Instituto(4);
		marte.agregarDepartamento("apple", Double.MAX_VALUE);
		assertTrue(marte.realizarPedido("apple", Double.MAX_VALUE));
	}
	@Test
	void realizarPedidoLimiteNegativo() { //Compruebo que la funcion realizarPedido pueda operar con el valor minimo permitido
		Instituto venus = new Instituto(4);
		venus.agregarDepartamento("appleMalvada", Double.MIN_VALUE);
		assertTrue(venus.realizarPedido("appleMalvada", Double.MIN_VALUE));
	}

	//VALORES EQUIVALENCIA

	

	
	

}
