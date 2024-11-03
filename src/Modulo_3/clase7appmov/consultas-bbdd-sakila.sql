SELECT * FROM actor;

SELECT COUNT(*)
FROM actor; -- cuenta todo y lo junta asi que da un solo numero

-- // ----------------------------
SELECT * FROM film;

SELECT COUNT(*)
FROM film
WHERE length > 90;

-- // ----------------------------
SELECT MAX(length)
FROM film;

-- ej: las peliculas con el mayor tiempo
SELECT title, description, length
FROM film
WHERE length = (
	SELECT MAX(length)
    FROM film
);

-- ej: las peliculas con el menor tiempo
SELECT title, description, length
FROM film
WHERE length = (
	SELECT MIN(length)
    FROM film
);

-- // ----------------------------
-- SUM : suma los valores de una columna especifica, la columna debe tener solo valores tipo numerico
	  -- el resultado debe poder soportarlo la columna, no debe ser mayor a su limite por ej que usen SMALLINT
SELECT SUM(total_ventas)
FROM factura;

-- // ----------------------------
-- AVG : devuelve el promedio de todos los datos almacenados, la columna debe tener solo valores tipo numerico
	 -- si hay un valor nulo lo ignora
SELECT AVG(total_venta)
FROM factura;
