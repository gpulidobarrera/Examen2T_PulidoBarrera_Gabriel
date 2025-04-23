# Examen2T_PulidoBarrera_Gabriel
Pruebas de Valores Límite: Explica qué valores probaste y qué resultados esperabas:

He probado a usar DOUBLE.MAX_VALUE y DOUBLE.MIN_VALUE en tanto procesarPedido y realizarPedido, los departamentos aceptaban estas cantidades puesto a que ellos mismos tenian un MAX_VALUE y MIN_VALUE, y he comprobado si funcionaban, lo cual lo hacian.


Pruebas de Equivalencia: Describe las clases de equivalencia que cubriste y los resultados de las pruebas.

He probado que el nombre y presupuesto que le daba a los departamentos era el equivalento al que luego se escribia y recibia por los metodos getters.


Pruebas de Cobertura de Decisiones: Explica qué decisiones cubriste y cómo verificaste cada una.

he probado los caminos del IF de procesar pedido y el IF de realizarPedido


Pruebas de Cobertura de Caminos Independientes: Documenta los caminos que cubriste en las pruebas y qué resultados esperabas

Casi todos los caminos ya estaban probados con los de cobertura de decisiones, puesto a que el programa como tal no tiene mucho con lo que trabajar, el que faltaba era si no encontraba un resultado en el FOR de realizarPedido, el cual he probado


Pruebas de Integración: Describe cómo realizaste la integración entre los métodos y los resultados de las pruebas.

He probado a hacer dos llamas a realizarPedido, una donde creaba un departamento, y otra en la que no, si se conectaba bien departamento y instituto, el primero me hubiera dejado, ya que el departamento existia, y realizarPedido hace una llamada a procesarPedido, y el segundo, debia de fallar, puesto a que que no existia el departamento, y era imposible hacer un procesarPedido. Todo ha salido segun planeado.


----------


nota: dijiste que los getters y setters no hacia falta hacerles pruebas, por las que no las he hecho por la mayor parte.
