-- FUNCIONES DE CONJUNTO

-- COUNT : por ej: cuenta el numero de filas en una tabla; la cantidad especifica que existe en una tabla
SELECT COUNT(*)
FROM empleado
WHERE Clase = SENIOR AND Experiencia <2;

-- MAX : entega el valor maximo en una columna especifica
	  -- por ej: en la tabla empleados mostrar edad del mayor empleado
SELECT nombre, apellido, edad
FROM emppleado
WHERE edad = (SELECT MAX(edad) FROM empleado);

