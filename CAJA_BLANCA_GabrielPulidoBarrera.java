package examen;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CAJA_BLANCA_GabrielPulidoBarrera {
	//Pruebas de Cobertura de Caminos Independientes, Compruebo que todos los camino sean ejecutados al menso una vez.
	// Departamento.java
	
	@Test
	void testProcesarPedidoDepartamentoValido(){ // Compruebo que el programa acepte un pedido valido en departamento.java
		Departamento departamento1 = new Departamento("departamento1", 200);
		assertTrue(departamento1.procesarPedido(40), "El programa ha aceptado un pedido invalido");
	}
	@Test
	void testProcesarPedidoDepartamentoInvalido(){ // Compruebo que el programa rechace un pedido invalido en departamento.java
		Departamento departamento2 = new Departamento("departamento1", 200);
		assertFalse(departamento2.procesarPedido(400), "El programa ha aceptado un pedido invalido");
	}
	// Instituto.java
	@Test
	void testRealizarPedidoInstitutoPresupuestoValido() { // Compruebo que el programa acepte un pedido valido en instituto.java
		Instituto instituto1 = new Instituto(5);
		instituto1.agregarDepartamento("departamentoInstituto", 250);
		assertTrue(instituto1.realizarPedido("departamentoInstituto", 140));
	}
	@Test
	void testRealizarPedidoInstitutoPresupuestoInvalido() { // Compruebo que el programa rechace un pedido valido en instituto.java
		Instituto instituto2 = new Instituto(5);
		instituto2.agregarDepartamento("departamentoInstituto2", 270);
		assertFalse(instituto2.realizarPedido("departamentoInstituto", 1040));
	}
	@Test
	void testRealizarPedidoInstitutoNoEncontrado() { // Compruebo que el programa rechace un departamento inexistente pedido valido en instituto.java
		Instituto instituto3 = new Instituto(5);
		instituto3.agregarDepartamento("departamentoInstituto3", 280);
		assertFalse(instituto3.realizarPedido("departamentoFantasma", 1));
	}
	
}
