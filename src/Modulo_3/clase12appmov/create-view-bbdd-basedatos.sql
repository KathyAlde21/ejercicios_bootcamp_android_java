USE basedatos;

-- VISTAS:
CREATE VIEW nombre_vista AS
SELECT campo1, campo2
FROM nombre_tabla
WHERE campoo = 'valor';


SELECT * FROM usuarios;
-- // las vistas muestran los datos que seleccione pero si modifico las tablas no se actualizan solas
-- // se parte con CREATE VIEW y para nombrar la tabla antepongo vista

CREATE VIEW vista_usuarios AS
SELECT nombre, apellido, edad
FROM usuarios;

SELECT * FROM vista_usuarios;

-- // -------------------------

-- // nombre completo y lenguaje join 3 tablas
CREATE VIEW vista_usuarios_lenguajes AS
SELECT CONCAT(u.nombre, ' ', u.apellido) AS Nombre, l.nombre AS Lenguaje
FROM usuarios_lenguajes AS ul
INNER JOIN usuarios AS u
ON ul.fk_id_usuario = u.id_usuario
INNER JOIN lenguajes AS l
ON ul.fk_id_lenguaje = l.id_lenguaje;

SELECT * FROM vista_usuarios_lenguajes;

