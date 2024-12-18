-- // CRUD => 4 operaciones básicas que se pueden hacer en una BBDD
-- Create: crear
-- Read: leer
-- Update: actualizar
-- Delete: eliminar

-- // Crear una Tabla
-- Se utilizan diferentes palabras para expresar el tipo de dato
-- INT: integer - dato numerico
-- VARCHAR(n): dato String en que n indica la cantidad de caracteres
-- DOUBLE: dato numerico que permite decimal, positivo y negativo
-- DATE: fecha en formato YYYY-MM-DD
-- DATETIME:fecha en formato YYYY-MM-DD + tiempo en formato HH:MI:SS
-- NOT NULL: se agrega para obligar a que el campo lleve información
-- UNIQUE(param): el dato debe ser único dentro de la tabla, ej: id, email
-- PRIMARY KEY(param): llave primaria de la tabla, atributo que la representa
-- CHECK(conditional): permite crear una restriccion o validacion para un dato
-- AUTO_INCREMENT: se coloca en el dato que debe aumentar de forma automática, por ej: id
-- CURRENT_TIMESTAMP(): se usa para crear fecha y hora que marcan el momento en que se crea un dato. Debe
-- ir acompañado por DATETIME y en ocaciones por DEFAULT
