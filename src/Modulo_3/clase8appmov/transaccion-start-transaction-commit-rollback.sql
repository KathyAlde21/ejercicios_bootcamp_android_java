START TRANSACTION;

INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUES ('Juanito', 'Araya', 'Escuela D-25', 800000),
('Camila', 'Gaete', 'Escuela Z001', 1200000);

SELECT * FROM profesores;

COMMIT; -- nos aseguramos que la transaccion es valida y cierra la transaccion

-- // ------------------------
START TRANSACTION;

INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUES ('Javiera', 'Gallardo', 'Escuela 12', 700000);

-- como no he hecho COMMIT puedo hacer ROLLBACK
ROLLBACK;

SELECT * FROM profesores;
INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUES ('Javiera', 'Gallardo', 'Escuela 13', 700000);
-- no funciono ROLLBACK, voy a crear otro

-- // ------------------------
START TRANSACTION;

INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUES ('Javiera', 'Gallardo', 'Escuela 14', 700000);

SELECT * FROM profesores;

ROLLBACK; -- elimina todos los cambios realizados dentro de la transaccion

SELECT * FROM profesores;

-- ** en ese orden funciono
-- // ------------------------
START TRANSACTION;

DELETE FROM profesores -- funciono
WHERE idProfesor = 8;

SELECT * FROM profesores;

DELETE FROM profesores -- funciono
WHERE idProfesor = 5;

-- si me doy cuenta que no deberia haberlos borrado hago un ROLLBACK por si puedo recuperarlo
ROLLBACK; -- aunque no me funciono y perdi ambos datos

