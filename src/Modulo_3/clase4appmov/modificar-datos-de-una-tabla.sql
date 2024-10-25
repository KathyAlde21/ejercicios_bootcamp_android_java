-- MODIFICAR DATOS DE UNA TABLA
-- usar WHERE cuando se quiera modificar un dato para modificar lo especifico y no todo
SELECT * FROM profesores;

-- // si lo escribo asi le cambio los datos a todos lo que lo hace peligroso si me equivoco
-- UPDATE profesores
-- SET sueldo = 1000000;

-- // asi cambio el dato especifico
UPDATE profesores
SET sueldo = 1000000
WHERE idProfesor = 3;

UPDATE profesores
SET sueldo = 1450000
WHERE idProfesor = 1;
