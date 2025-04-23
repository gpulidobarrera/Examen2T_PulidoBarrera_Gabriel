package examen;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class INTEGRACION_GabrielPulidoBarrera {

	
	@Test
	void pruebaDeIntegracion() { // Compruebo que la integración funciona, creando un departamento desde un instituto y luego haciendo una funcion que requiera dicho departamento.
		Instituto institutoIntegracion = new Instituto(4);
		institutoIntegracion.agregarDepartamento("DepartamentoIntegracion", 200);
		assertTrue(institutoIntegracion.realizarPedido("DepartamentoIntegracion", 50));
	}
	@Test
	void testRealizarPedidoInstitutoNoEncontrado() { // Compruebo que la integracion funciona, intentando ejecutar el pedido sin antes crear el departamento.
		Instituto institutoIntegracion2 = new Instituto(5);
		institutoIntegracion2.agregarDepartamento("DepartamentoIntegracion2", 280);
		assertFalse(institutoIntegracion2.realizarPedido("departamentoInexistente", 1));
	}
}
