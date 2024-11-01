USE peliculas_pixar;

-- listado peliculas
SELECT nombrePelicula
FROM peliculas;

-- listado directores
SELECT directorPelicula
FROM peliculas;

-- muestra listado peliculas y sus directores
SELECT nombrePelicula, directorPelicula
FROM peliculas;

-- muestra listado peliculas y año
SELECT nombrePelicula, año
FROM peliculas;

-- muestra todos los datos de la peliculas que tenga id 6
SELECT * FROM peliculas
WHERE idPeliculas = 6;

-- muestra todos los datos de las peliculas que fueron estrenadas entre 2000 y 2010
SELECT * FROM peliculas
WHERE año
BETWEEN 2000 AND 2010;

-- muestra todos los datos de las peliculas que NO fueron estrenadas entre 2000 y 2010
SELECT * FROM peliculas
WHERE año
NOT BETWEEN 2000 AND 2010;

-- // muestra campo titulo y año de las primeras 5 peliculas de la lista
-- opcion 1
SELECT idpeliculas, nombrePelicula, año
FROM peliculas
WHERE idpeliculas
BETWEEN 1 AND 5;

-- opcion 2
SELECT nombrePelicula, año
FROM peliculas
LIMIT 5;

-- opcion 3
SELECT nombrePelicula, año
FROM peliculas
WHERE idpeliculas < 6;
