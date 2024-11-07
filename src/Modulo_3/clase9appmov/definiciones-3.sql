-- TEORIA

-- // --------------------------------------------------------------------------------------------------------------
-- DIFERENCIAS CON EL MODELO CONCEPTUAL

-- MODELO RELACIONAL (RM):
-- => incluye la generalidad de la BBDD:
	-- Atributo: Representa cada columna de una tabla.
	-- Tablas: Tiene filas y columnas.
	-- Tupla: Representa la fila de una tabla.
	-- Esquema de relación: Es el nombre de la relación.
	-- Grado: Número total de atributos.
	-- Cardinalidad: Número total de filas.
	-- Columna: Representa el conjunto de valores para un atributo en específico.
	-- Instancia de relación: Conjunto finito de tuplas. Nunca duplicadas.
	-- Clave de relación: Cada fila tiene por lo menos una clave de relación.
	-- Dominio de atributo: Cada atributo tiene un valor y alcance predefinido
    
-- REGLAS DE TRANSFORMACION
-- => toda entidad se transforma en una tabla
-- => todo atributo se transforma en una columna
-- => el identificador unico se convierte en llave primaria
-- => en relaciones N:M se crea una tabla de union que posee dos claves foraneas, las que provienen de cada
	-- una de sus relaciones
-- => en relaciones 1:N la entidad del lado N añade la llave foranea para cumplir con la union entre ambas

-- // --------------------------------------------------------------------------------------------------------------
-- ASIGNANDO TIPOS DE DATOS Y RESTRICCIONES AL MODELO
-- => tipos numericos: se dividen en flotantes y enteros
-- => tipos de fecha: meses van de 1 a 12 y dias 1 a 31
	-- DATE: YYYY-MMM-DD del 1 enero 1001 al 31 diciembre 9999
    -- DATETIME: fecha del 1 enero 1001 al 31 diciembre 9999 + tiempo 23 hrs, 59 minutos, 59 segundos
		-- formato queda: YYYY-MM-DD hh:mm:ss
	-- TIMESTAMP: combinacion fecha y hora rango 1 enero 1970 al 2037, su formato va a depender del tamaño que
		-- tenga, pudiendo mostrartodos los datos o solamente el año
	-- TIME: almacena una hora, rango desde -838 horas 59 minutos 59 segundos a 838 horas 59 minutos 59 segundos
		-- formato HH:MM:SS
    -- YEAR: almacena su año, rango desde 1901 a 2155, soporta el formato de 2-4 digitos para almacenar el año

-- // --------------------------------------------------------------------------------------------------------------
-- TIPOS DE CADENA:
-- => hay más opciones:
	-- Char(n): Contiene desde 0 a 255 caracteres.
	-- Varchar(n): Contiene desde 0 a 255 caracteres. Tiene la capacidad de almacenar dos subtipos de cadenas,
		-- respecto a objetos binarios.
	-- TinyText y TinyBlob: Columna con una longitud máxima de 255 caracteres.
	-- Blob y Text: Texto con un máximo de 65535 caracteres.
	-- MediumBlob y MediumText: Texto con un máximo de 16777215 caracteres.
	-- LongBlob y LongText: 4294967295 caracteres. Sus paquetes tienen un máximo de 16mb.
	-- Enum: Un único valor que acepta entre 65535 valores distintos.
	-- Set: Puede contener ninguno o varios valores de una lista. Máximo 64 valores.
    
 -- // --------------------------------------------------------------------------------------------------------------
-- DICCIONARIO DE DATOS   
-- Listado organizado de todos los campos y tablas pertenecientes a un BBDD.
-- En el se encuentran todos los elementos que van a formar parte del modelo de la BBDD.
-- Guarda los detalles y descripciones de cada uno de los elementos.
-- Facilita el manejo de los detalles en sistemas de gran volumen.
-- Localizar errores en el proceso de diseño es más sencillo. 
-- Otorga un conocimiento estándar para quienes trabajan con la misma BBDD.
-- Si está desarrollado de manera adecuada, será fácil para el analista encontrar un dato en particular si
	-- así lo requiere.
    
-- => Datos elementales: Es el elemento más atómico de cualquier conjunto de datos.
-- => Nombre de los datos: Se usa para distinguir un dato de otro.
-- => Descripción de los datos: Se deben escribir suponiendo que quienes lo lean, no conocen nada del sistema.
-- => Alias: Distinto nombre que se le puede dar a un dato.
-- => Longitud de campo: Espacio que ocupa un dato.

 -- // --------------------------------------------------------------------------------------------------------------
-- APLICABILIDAD
-- => los diccionarios poseen un servicio de validacion y actualizacion de BBDD

