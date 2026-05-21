# Resumen
Este proyecto consiste en una aplicación de consola desarrollada en Java. El objetivo principal del ejercicio es aplicar el Principio de Responsabilidad Única (SRP) —la primera regla del compendio SOLID— para resolver un problema de generación de patrones de texto escalares y su posterior almacenamiento en disco duro mediante archivos de texto plano (.txt).

## Características
Diseño Orientado a SOLID (SRP): Desacopla por completo la lógica del dominio de la aplicación en tres entidades independientes con una única razón para cambiar: entrada/salida de consola, motor algorítmico y persistencia en disco.

Algoritmia de Expansión Lineal: Construye una matriz triangular de texto mediante bucles anidados, controlando los espaciados intermedios mediante la clase mutable y eficiente StringBuilder.

Persistencia Indexada: Vuelca colecciones de datos secuenciales directamente al sistema de archivos utilizando un búfer de escritura (BufferedWriter) para optimizar los accesos a disco.
