-- mostrar los datos de todas las peliculas Toy Story
SELECT nombrePelicula
FROM peliculas
WHERE nombrePelicula LIKE 'Toy Story%';  -- % al final para ver todas si hay más de una

-- // -----------------------------------
-- mostrar datos de todas las peliculas donde el director es John Lasseter
-- opcion 1
SELECT * FROM peliculas
WHERE directorPelicula LIKE 'John Lasseter';

-- opcion 2
SELECT * FROM peliculas
WHERE directorPelicula IN('John Lasseter');

-- // -----------------------------------
-- mostrar datos de todas las peliculas donde el director NO es John Lasseter
-- opcion 1
SELECT * FROM peliculas
WHERE directorPelicula NOT LIKE 'John Lasseter';

-- opcion 2
SELECT * FROM peliculas
WHERE NOT directorPelicula IN('John Lasseter');

-- // -----------------------------------
-- muestra los datos de todas las peliculas que comiencen con 'WALL-'
-- el % y _ dentro de like funcionan similar
-- con % muestra todos independiente del tipo y cantidad de caracteres
SELECT * FROM peliculas
WHERE nombrePelicula LIKE 'WALL-%';

-- con _ muestra tantos caracteres como _
SELECT * FROM peliculas
WHERE nombrePelicula LIKE 'WALL-_';

-- // -----------------------------------
-- mostrar todos los directores ordenados alfabeticamente sin repetir los datos
SELECT DISTINCT directorPelicula
FROM peliculas
ORDER BY directorPelicula ASC;

-- mostrar titulos de las ultimas 4 peliculas estrenadas ordenadas de las reciente a la mas antigua
SELECT nombrePelicula, año
FROM peliculas
ORDER BY año DESC
LIMIT 4;

-- // -----------------------------------
-- mostrar todos los datos de las primeras cinco peliculas y ordenar las filas alfabeticamente
-- opcion 1: las primeras 5 por id ordenadas alfabeticamente
SELECT * FROM peliculas
WHERE idpeliculas
BETWEEN 1 AND 5
ORDER BY nombrePelicula ASC;

-- opcion 2: las primeras 5 por orden alfabetico
SELECT * FROM peliculas
ORDER BY nombrePelicula ASC
LIMIT 5;

-- // -----------------------------------
-- mostrar todos los datos de las SIGUIENTES cinco peliculas
-- opcion 1: las segundas 5 por id ordenadas alfabeticamente
SELECT * FROM peliculas
WHERE idpeliculas
BETWEEN 6 AND 10
ORDER BY nombrePelicula ASC;

-- opcion 2: le digo que quiero ordenar las peliculas de 5 en 5 y quiero ver desde la 6
SELECT * FROM peliculas
ORDER BY nombrePelicula ASC
LIMIT 5 OFFSET 5; -- desde la pelicula 6 muestra 5
-- LIMIT 5 OFFSET 15; -- desde la pelicula 16 muestra 5
