-- VISTAS
-- -> select que se almacena virtual
-- -> es una consulta que se representa como una tabla virtual ya que solo muestra la informacion, funciona de
	-- forma temporal, se crea una tabla temporal
-- -> tienen la misma estructura que una tabla (filas y columnas)
-- -> la gran diferencia en que ella solo se almacena deficniciones y no datos
-- -> se puede definir como una "referencia" a una tabla

CREATE VIEW nombre_vista AS
SELECT campo1, campo2
FROM nombre_tabla
WHERE campo = 'valor';

-- Importante => para MySQL no hay diferencia entre una tabla y una vista, por eso el nombre de la vista
			-- no puede ser el mismo de las tablas a las que pediremos datos

-- // ---------------------------------------------------------------------------------
