-- para hacer consultas sin entrar directo a una tabla hago click en Create new SQL tab
-- como tengo varias bases de datos puedo llamar la tabla de dos formas:

--/---------------------------------------------------------------/--
-- FORMA 1)
USE sakila;

SELECT * FROM city;

--/---------------------------------------------------------------/--
-- FORMA 2)
SELECT * FROM sakila.city;

-- la llame primero colocando el nombre de la base (ofrece autocompletar)
-- luego . y la tabla (ofrece autocompletar)
