-- RELACION ENTRE TABLAS 1:1 (uno es a uno)
USE basedatos;

CREATE TABLE usuario(
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    email VARCHAR(100),
	UNIQUE(id_usuario)
);

CREATE TABLE rut(
	id_rut INT AUTO_INCREMENT PRIMARY KEY,
    rut INT NOT NULL,
    fk_id_usuario INT, -- idealmente poner la FK para diferenciar
    UNIQUE(id_rut),
    FOREIGN KEY(fk_id_usuario) REFERENCES usuario(id_usuario)
);

-- // ---------------------------------------------------
-- RELACION ENTRE TABLAS 1:N (uno es a muchos)
CREATE TABLE empresa(
    id_empresa INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- puedo agregar empresa a usuario y para eso agrego la empresa como llave foranea
-- paso 1: crear llave foranea en usuario
ALTER TABLE usuario
ADD fk_id_empresa INT;

-- paso 2: establecer union de las tablas creando el enlace con CONSTRAINT
ALTER TABLE usuario
ADD CONSTRAINT fk_id_empresa
FOREIGN KEY(fk_id_empresa) REFERENCES empresa(id_empresa);

-- // ---------------------------------------------------
-- RELACION ENTRE TABLAS N:M (muchos a muchos)
-- para esto se crea una tabla intermedia donde interactuen varias llaves
CREATE TABLE lenguajes (
	id_lenguaje INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE usuario_lenguajes (
	id_usuario_lenguajes INT AUTO_INCREMENT PRIMARY KEY,
    fk_id_usuario INT,
    fk_id_lenguaje INT,
    FOREIGN KEY(fk_id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY(fk_id_lenguaje) REFERENCES lenguajes(id_lenguaje),
    UNIQUE(fk_id_usuario, fk_id_lenguaje)
);
