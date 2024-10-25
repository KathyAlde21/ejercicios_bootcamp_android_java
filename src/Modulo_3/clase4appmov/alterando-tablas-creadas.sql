-- ALTERANDO TABLAS CREADAS
SELECT * FROM profesores1;

-- agregando nueva columna
-- ALTER TABLE nombre_tabla ADD nuevo_campo TIPO_DATO;
ALTER TABLE profesores1
ADD fecha_actual DATETIME DEFAULT CURRENT_TIMESTAMP();

-- cambiando nombre de la columna
-- ALTER TABLE nombre_tabla RENAME COLUMN nombre_campo TO nuevo_nombre;
ALTER TABLE profesores1
RENAME COLUMN fecha_actual TO fechaActual;

-- modificar tipo de dato
-- ALTER TABLE nombre_tabla MODIFY COLUMN nombre_campo NUEVO_TIPO_DATO;
ALTER TABLE profesores1
MODIFY COLUMN sueldo DOUBLE NOT NULL;

ALTER TABLE profesores1
MODIFY COLUMN nombre VARCHAR(50); -- antes 25

-- // -----------------------------------------------------------------------------
-- eliminar una columna => DROP borra literal todo USAR CON CUIDADO
-- ALTER TABLE nombre_tabla DROP COLUMN nombre_campo;
ALTER TABLE profesores1
DROP COLUMN fechaActual;

ALTER TABLE profesores1
DROP COLUMN sueldo;
