-- // agrego la informacion a la base de datos que se usa en clases por si requiero consultas
USE basedatos;

CREATE TABLE peliculas(
id_peliculas INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombrePelicula VARCHAR(50) NOT NULL,
directorPelicula VARCHAR(50) NOT NULL,
anio YEAR NOT NULL,
duracion INT NOT NULL,
UNIQUE(id_peliculas)
);

-- alimentando tabla
INSERT INTO peliculas (nombrePelicula, directorPelicula, anio, duracion)
VALUE ('Bichos', 'John Lasseter', 1998, 95), -- 1
('Ratatouille', 'Brad Bird', 2007, 115), -- 2
('Monsters University', 'Dan Scanlon', 2013, 110), -- 3
('Valiente', 'Brenda Chapman', 2012, 102), -- 4
('Toy Story 3', 'Lee Unkrich', 2010, 103), -- 5
('Buscando a Nemo', 'Andrew Stanton', 2003, 107), -- 6
('Los Increibles', 'Brad Bird', 2004, 116), -- 7
('Toy Story', 'John Lasseter', 1995, 81), -- 8
('Cars', 'John Lasseter', 2006, 117), -- 9
('Toy Story 2', 'John Lasseter', 1999, 93), -- 10
('Cars 2', 'John Lasseter', 2011, 120), -- 11
('Monster, Inc', 'Pete Docter', 2001, 92), -- 12
('WALL-E', 'Andrew Stanton', 2008, 104), -- 13
('Up', 'Pete Docter', 2009, 101); -- 14