-- // USE basedatos; => cuando tengo dudas de en que base estoy y tengo varias, aunque me puedo posicionar y y doble
-- click para que quede marcada
CREATE TABLE profesores1 (
	idProfesor INT,
    nombre VARCHAR(25),
    apellido VARCHAR(25),
    escuela VARCHAR(50),
    fecha_contratacion DATE,
    sueldo DOUBLE
);
-- // ---------------------------------------------------------------
-- Base con datos obligatorios:
CREATE TABLE profesores2 (
	idProfesor INT NOT NULL,
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25) NOT NULL,
    escuela VARCHAR(50) NOT NULL,
    fecha_contratacion DATE,
    sueldo DOUBLE
);
-- // ---------------------------------------------------------------
-- Base con primary key:
CREATE TABLE profesores3 (
	idProfesor INT PRIMARY KEY AUTO_INCREMENT, -- por obligacion lleva dato no necesita decir not null
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25) NOT NULL,
    escuela VARCHAR(50) NOT NULL,
    fecha_contratacion DATE,
    sueldo DOUBLE
    -- PRIMARY KEY(idProfesor) -- también se puede anotar así
);
-- // ---------------------------------------------------------------
-- Base con primary key, autoincrementar y que sea unico:
CREATE TABLE profesores (
	idProfesor INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25) NOT NULL,
    escuela VARCHAR(50) NOT NULL,
    fecha_contratacion DATE,
    sueldo DOUBLE NOT NULL,
    -- PRIMARY KEY(idProfesor),
    fechaRegistro DATETIME DEFAULT CURRENT_TIMESTAMP(), -- fecha y hora de creacion
    UNIQUE(idProfesor), -- puede ir arriba pero en general se usa abajo
    CHECK(sueldo >= 500000)    
);
-- // ---------------------------------------------------------------
-- mostrar que puede estar todo en una linea pero queda ilegible
CREATE TABLE profesores5 (idProfesor INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(25) NOT NULL, apellido VARCHAR(25) NOT NULL, escuela VARCHAR(50) NOT NULL, fecha_contratacion DATE, sueldo DOUBLE NOT NULL, fechaRegistro DATETIME DEFAULT CURRENT_TIMESTAMP(), UNIQUE(idProfesor), CHECK(sueldo >= 500000));
