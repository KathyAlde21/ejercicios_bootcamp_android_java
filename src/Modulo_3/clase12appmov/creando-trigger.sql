-- ejercicio TRIGGER

DELIMITER //
CREATE TRIGGER log_tabla_usuarios AFTER INSERT ON usuarios
FOR EACH ROW
BEGIN
	INSERT INTO acciones(accion)
	VALUES ('Nuevo usuario creado');
END //
DELIMITER ;


-- con esto tomo los datos de usuarios y alimento la tabla acciones con mensajes que indican que se realizo
-- en la tabla usuarios posterior a que se asocien
-- en ambos se ve la carpeta triggers pero solo en usuarios se lee la informacion
-- cada vez que haga un cambio en usuarios se va a disparar, si hago cambios en otras tablas no afectan

DROP TRIGGER log_tabla_usuarios; -- lo elimino pero en usuarios siguen quedando los datos

-- // -- Ahora voy a crear de nuevo la tabla

DELIMITER //
CREATE TRIGGER log_tabla_usuarios AFTER INSERT ON usuarios
FOR EACH ROW
BEGIN
	INSERT INTO acciones(accion)
	VALUES (CONCAT("Usuario creado: ", NEW.nombre, ' ', NEW.apellido, ' - Edad: ', NEW.edad));
END //
DELIMITER ;

