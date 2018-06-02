# Examen Parcial - Diseño y Construcción de Software - Semestre 2018-1 - UNMSM-UPG-FISI

## Teoría (6 puntos)
### Pregunta 1. Explicar:
* Diseño de software.-
 Es una actividad del ciclo de vida de la ingeniería de software donde los requisitos son analizados para tener una descripción de la estructura interna del software que será de base para su construcción.

* Patrón de diseño.-
Son técnicas para dar solución a problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces. 
Es una solución a un problema de diseño
Son soluciones para problemas típicos y recurrentes.

* Principios del diseño de software.-
Son nociones clave que nos proporcionan los fundamentos para diferentes enfoques y conceptos de diseño de software.
- Abstracción
- AcoplamientoyCohesión
- DescomposiciónyModularidad
- EncapsulamientoyOcultamientodeInformación
- SeparacióndeInterfazeImplementación
- SuficienciayCompletitud
- SeparacióndeIntereses

* Síntomas de un diseño pobre.-
Rigidez
	Cuando el software es difícil de cambiar porque impactan sobre otros módulos.
Fragilidad
	Cuando un programa se rompe en varios lugares realizando un cambio sencillo.
	Cuando los cambios impactan en módulos que no tienen relación con el módulo modificado.
Inmovilidad
	Cuando el sistema es tan enredado que es difícil de reutilizar sus componentes.	
Complejidad Innecesaria
	Cuando las estructuras no aportan beneficios.
	Al anticiparse al cambio el diseño contiene elementos que nunca son usados y el diseño es difícil de entender.	
Opacidad
	Cuando el software se ha escrito de manera opaca y compleja.
	Cuando el sistema es difícil de usar y entender.
	cuando su existencia no se explica claramente.
Repetición Innecesaria	
	Cuando el software es difícil de entender y mantener.
	Cuando se omiten abstracciones.
	Cuando se tienen estructuras repetidas que pueden ser unificadas.
	
* Atributo de calidad.-
 Son las características no funcionales que son de mucha importancia en un sistema de software. 

* Drivers arquitecturales.-

Design purpose
•Quality attributes
•Primary functionality
•Architectural concerns
•Constraints


## Práctica (14 puntos)
Para cada pregunta presentar diseño UML y código fuente (agregar a ebautistau@unmsm.edu.pe como colaborador del repositorio github).
Los ejemplos propuestos NO pueden ser los vistos en clases, ni tampoco bajado de la web.

### Pregunta 2. (3 puntos)
- Construya un ejemplo en la que se aplique el principio: "Favorecer la composición de objetos frente a la herencia de clases".

### Pregunta 3. (3 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta3
- Mejorar la implementación de la red social Reddit.
- Soportar la red social Pinterest.
- Usar un contenedor IoC.
- Indicar los patrones y/o principios implementados.

### Pregunta 4. (2 puntos)
- Construya un ejemplo aplicando el patrón notification.

### Pregunta 5. (6 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta5
- Aplicar el patrón Abstract Factory para evitar exponer clases concretas (WhiteFinish, FastProcessor, etc) en el cliente (Client.java).
- El nuevo cliente (Client.java) debe mostrar la misma información.
