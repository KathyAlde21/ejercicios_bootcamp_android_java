USE basedatos;

-- INNER JOIN
SELECT * FROM tabla_A
INNER JOIN tabla_B
ON tabla_A.primary_key = tabla_B.foreign_key;


-- 1 : 1 => uno es uno
SELECT * FROM usuarios
INNER JOIN rut
ON usuarios.id_usuario = rut.fk_id_usuario;

SELECT nombre, rut
FROM usuarios
JOIN rut 					-- lo toma igual que un INNER JOIN 
ON usuarios.id_usuario = rut.fk_id_usuario;

-- // -------------------------------------------------------------
-- puedo usar un alias que puede ser una palabra o letra
-- ej con alias con palabra reservada AS
SELECT nombre, rut FROM usuarios AS u
JOIN rut AS r
ON u.id_usuario = r.fk_id_usuario;

-- 1: N => uno es muchos
SELECT empresas.nombre AS Empresa, usuarios.nombre AS Usuario
FROM usuarios
INNER JOIN empresas
ON usuarios.fk_id_empresa = empresas.id_empresa;


-- puedo anotar el alias más abajo y lo lee igual
SELECT e.nombre Empresa, u.nombre Usuario
FROM usuarios u
INNER JOIN empresas e
ON u.fk_id_empresa = e.id_empresa;

-- // -------------------------------------------------------------

-- N:M => muchos a muchos => lleva dos INNER JOIN por las conexiones
SELECT usuarios.nombre, lenguajes.nombre
FROM usuarios_lenguajes
INNER JOIN usuarios
ON usuarios_lenguajes.fk_id_usuario = usuarios.id_usuario
INNER JOIN lenguajes
ON usuarios_lenguajes.fk_id_lenguaje = lenguajes.id_lenguaje;

-- con alias
SELECT usuarios.nombre AS usuario, lenguajes.nombre AS lenguaje
FROM usuarios_lenguajes
INNER JOIN usuarios
ON usuarios_lenguajes.fk_id_usuario = usuarios.id_usuario
INNER JOIN lenguajes
ON usuarios_lenguajes.fk_id_lenguaje = lenguajes.id_lenguaje;

-- con alias
SELECT u.nombre Usuario, l.nombre Lenguaje
FROM usuarios_lenguajes ul
INNER JOIN usuarios u 
ON ul.fk_id_usuario = u.id_usuario
INNER JOIN lenguajes l
ON ul.fk_id_lenguaje = l.id_lenguaje;

