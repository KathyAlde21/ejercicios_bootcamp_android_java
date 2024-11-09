-- PROCEDIMIENTOS ALMACENADOS
-- => Es una porción de código que podemos guardar y reutilizar las veces que estimemos convenientes.
-- => Es útil cuando repetimos constantemente la misma consulta o sentencia SQL.
-- => Tienen la capacidad de aceptar datos como parámetros para interactuar con ellos.

-- en resumen, con el delimitador digo: 'este bloque es uno solo, marcando donde comienza y donde termina'

DELIMITER // -- comienzo
CREATE PROCEDURE nombre_procedimiento(IN dato TIPO, OUT dato TIPO) -- debe tener dato de entrada pero no necesaria% de salida
BEGIN
	SELECT * FROM tabla;
END //
DELIMITER ; -- fin

-- => en MySQL es necesesario definir limitadores cada vez que queramos utilizar un procedimiento almacenado. Esto le
	-- indica al motor de BBDD que el bloque es completamente independiente
-- => Con Delimiter vamos a evitar que las consultas interiores detengan el código y también le vamos a marcar
	-- claramente la finalización del mismo.
-- => Una vez tengamos creados nuestro/os procedimientos almacenados, tenemos que acceder a ellos de alguna forma.
-- => CALL nombre_procedimiento(dato);
-- => Una vez tengamos nuestro procedimiento creado en una base de datos, lo podemos utilizar en el archivo SQL que
	-- nosotros estimemos convenientes, no es necesario que sea el mismo en donde fue creado el procedimiento.
    
