-- TRIGGERS

-- => Un disparador es una función que va a disparar un evento antes o después de una acción en especifico.
-- => Se pueden utilizar para insertar, actualizaro borrar registros de otras tablas, o incluso de otras BBDD cuando
	-- se realizan cambios en la tabla que estamos trabajando.
-- => Nos puede servir para algunas cosas como por ejemplo:
		-- Crear logs de acciones.
		-- Actualizar fechas de modificación en casos específicos.

    
DELIMITER //
CREATE TRIGGER nombre_gatillo  MOMENTO EVENTO ON tabla_recibe_event  -- momento => INSERT, DELETE, etc
FOR EACH ROW
BEGIN
	INSERT INTO tabla(campo) VALUE ('valor');
END //
DELIMITER ;

-- => se puede disparar antes o después de la acción según lo que necesite
-- => si esta mal hecho o de forma mal intencionada puede eliminar datos al ingresar nuevos, entre otros
-- => si esta bien programado puede capturar datos al momento de ingresar en una tabla y enviarlos a otra
-- => si lo coloco antes debo esperar a que los datos ingresen a la tabla para poder llamarlos y trasladarlos
	-- a la otra tabla

-- ****** IMPORTANTE: *******
-- => Se recomienda utilizar las Trigger para que capturen el momento en AFTER, de esa manera nos aseguramos que
	-- vamos a tener todos los datos que lleguen al registro.
