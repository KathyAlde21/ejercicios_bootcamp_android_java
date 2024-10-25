-- ELIMINAR DATOS DE UNA TABLA
-- DROP => elimina todo rastro de la tabla
-- TRUNCATE => borra la informacion almacenada en la tabla

-- // idealmente NUNCA USAR DROP por el riesgo de eliminar informacion importante
TRUNCATE alumnos; -- elimina el contenido de la tabla

DROP TABLE alumnos; -- elimina toda la tabla y se actualiza solo
DROP TABLE profesores5;
DROP TABLE profesores4;

SELECT * FROM alumnos;
SELECT * FROM profesores;

-- Eliminar un dato o campo
DELETE FROM profesores
WHERE idProfesor = 5; -- elegi borrar todos los datos en ese id
