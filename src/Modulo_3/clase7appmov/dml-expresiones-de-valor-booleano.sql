-- DML - DATA MANIPULATION LANGUAGE
-- => INSERT
-- => DELETE
-- => SELECT
-- => UPDATE

-- // -- EXPRESIONES DE VALOR -------------------
-- expresiones numericas
-- => suma(+)
-- => resta(-)
-- => multiplicacion(*)
-- => division(/)

-- expresiones de string
-- => CONCAT('inteligencia', ' ', 'militar') -- el espacio es importante o queda todo pegado

-- expresiones de valor, datetime e intervalos
-- => DATETIME 
-- => CURRENT_TIMESTAMP : ingresa de forma automatica la fecha y hora en que se creo el dato
-- => NOW() : entrega hora y fecha actual
-- => NOW() + INTERVAL '7' DAY : entrega fecha y hora, 7 dias en el futuro a partir del momento de consultar
-- => INTERVAL : sirve para manejar tiempos entre un DATE y otro. Hay dos tipos: mes-año  // dia-tiempo
-- => DAY : (FechaDevolucion - FechaVencimiento) le decimos a la instruccion que estamos usando dia-tiempo

-- // ------ EXPRESIONES DE VALOR BOOLEANO ------------------------------------
-- se encarga de verificar la veracidad de un predicado
-- => (Clase = SENIOR) IS TRUE
-- => NOT (Clase = SENIOR) IS TRUE
-- => (Clase = SENIOR) IS FALSE
-- => (Clase = SENIOR) IS UNKNOW

-- // -- PREDICADOS -------
-- son el equivalente SQL de todas aquellas proposiciones logicas que nos podamos encontrar
-- ej: 'El empleado es senior' //con esto se podria crear una columna clase que contenga senior, medio, junio y asi filtrar
-- ej2: supongamos que queremos los empleados mas exitosos de una empresa
	-- CLASE = SENIOR AND Experiencia < 2
	-- conectan con and y para que sea verdadero de debe cumplir

-- not invierte el resultado que se estaba esperando, solo va a ser verdadero si clase es distinta de senior    
    -- NOT(CLASE = SENIOR)
