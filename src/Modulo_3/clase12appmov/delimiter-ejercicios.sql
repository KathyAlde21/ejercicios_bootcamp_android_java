-- ejercicios DELIMITER

DELIMITER //
CREATE PROCEDURE lenguajes_con_letra (IN letra CHAR)
BEGIN
	SELECT *
    FROM lenguajes
    WHERE nombre LIKE CONCAT('%', letra, '%'); -- con esto le digo quiero una letra x y no importa lo que antes o despues
END //
DELIMITER ;

-- borrando procedimiento
DROP PROCEDURE lenguajes_con_letra;

-- probando resultados obtenidos:
CALL lenguajes_con_letra('J');

-- // -----------------------------------------------------
-- si quiero que el dato no sea temporal sino persistente

DELIMITER //
CREATE PROCEDURE usuarios_con_letra(IN letra CHAR, OUT numero INT)
BEGIN
	SELECT COUNT(*) INTO numero
    FROM usuarios
	WHERE nombre LIKE CONCAT('%', letra, '%');
END //
DELIMITER ;

-- // ejecuto los call y luego el select, sino no puedo ver nada y sale todo null
CALL usuarios_con_letra('w', @cantidad_w);
CALL usuarios_con_letra('e', @cantidad_e);
CALL usuarios_con_letra('a', @cantidad_a);

SELECT @cantidad_w, @cantidad_e, @cantidad_a;

