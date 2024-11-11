-- datos tabla peliculas pixar

CREATE TABLE peliculas(
idPeliculas INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombrePelicula VARCHAR(50) NOT NULL,
directorPelicula VARCHAR(50) NOT NULL,
año YEAR NOT NULL,
duracion INT NOT NULL,
UNIQUE(idPeliculas)
);
