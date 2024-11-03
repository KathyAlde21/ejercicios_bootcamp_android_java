-- ACTUALIZANDO LA INFORMACION DE UNA TABLA
-- // -------------------------------------------------------
-- UPDATE : penultimo eslabon de un CRUD
-- 	=> sirve para actualizar datos de una tabla en especifico
-- 	=> permite modificar una cantidad controlada de datos
-- ej: con una consulta puedo aumentar el sueldo a profesores que ganan menos de 1 millon de pesos
UPDATE profesor SET
sueldo = sueldo + 200000
WHERE sueldo < 1000000;
 	 
-- 	=> se puede modificar más de un dato en la misma fila
-- ej: al profesor id 10 modifico fecha de contrato y sueldo
UPDATE profesor SET
fecha_contratacion = '2020-10-03',
sueldo = 700000
WHERE id_profesor = 10;

-- // -------------------------------------------------------
-- DELETE : va con WHERE y puede eliminar varios datos siempre y cuando se cumpla la consulta
-- ej: eliminar los profesores con sueldo uno u otro
DELETE FROM profesor
WHERE sueldo = (
	SELECT MAX(sueldo)
    FROM profesor
    )
OR sueldo = (SELECT MIN(sueldo) FROM profesor);

-- // -------------------------------------------------------
-- INSERT : permite clonar la estructura de una tabla a una nueva, ahorrandonos la creacion
		-- se pueden llevar los datos de una tabla a otra VACIA se hace con INSERT
INSERT INTO nueva_tabla
SELECT campos
FROM tabla_antigua
WHERE condicion;

-- // -------------------------------------------------------
-- INTEGRIDAD REFERENCIAL
-- tiene relacion con las llaves foraneas
-- 	=> la tabla que contiene FOREIGN KEY se denomina tabla Hija, referendo o secundaria
-- 	=> la tabla que origina la FOREIGN KEY se denomina Madre, referenciada o principal
-- 	=> una tabla puede tener mas de una llave foranea, una hija puede tener varias madres, depende de las relaciones

-- // -------------------------------------------------------
-- RESTRICCIONES
-- casi no se usan, sobre todo DROP
-- ALTER TABLE : cambia el nombre de una tabla
ALTER TABLE nombre_tabla;

-- DROP CONSTRAINT : elimina una condicion en caso de ser necesario, debe ir con ALTER TABLE
ALTER TABLE nombre_tabla
DROP CONSTRAINT restriccion;
