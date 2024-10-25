-- CAMBIAR ESTRUCTURA TABLAS
-- agregar nuevo campo:
ALTER TABLE nombre_tabla ADD nuevo_campo TIPO_DATO;

-- renombrar campo:
ALTER TABLE nombre_tabla RENAME COLUMN nuevo_campo TO nuevo_nombre;

-- modificar tipo de dato:
ALTER TABLE nombre_tabla MODIFY COLUMN nombre_campo NUEVO_TIPO_DATO;

-- eliminar un campo SIN VUELTA ATRAS - NO TE PREGUNTA NI CONFIRMA ELIMINA DE UNA
ALTER TABLE nombre_tabla DROP COLUMN nombre_campo;
