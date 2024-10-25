-- INSERTAR DATOS
-- las columnas deben estar en el mismo orden que se van a ingresar los datos
-- INSERT TO nombre_tabla(nombres_columnas) VALUES(datos_a_agregar);

SELECT * FROM profesores;

INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUE ('Pablo', 'Contreras', 'Juan Ignacio Molina', 800000);

INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUE ('Juan', 'Sandoval', 'Juan Ignacio Molina', 500000);

INSERT INTO profesores (nombre, apellido, escuela, sueldo, fecha_contratacion)
VALUE ('Francisca', 'Ivarra', 'Juan Ignacio', 650000, '2023-08-10');

-- mientras cumpla con los datos solicitados puedo agregar varios datos separados los () por comas
INSERT INTO profesores (nombre, apellido, escuela, sueldo)
VALUE ('Juanito', 'Perez', 'Salesianos', 800000),
('Pedrito', 'Jimenez', 'Salesianos', 1000000);
