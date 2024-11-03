-- // --------------------------------------------------------------------------------------
-- TRANSACCIONALIDAD EN LAS OPERACIONES
-- // ------------
-- TRANSACCIONALIDAD : es una unidad de trabajo que se realiza en una BBDD
					-- son una secuencia de trabajo que va a ser realizado de forma automatica o manual
                    -- es un conjunto de cambios, como crear, modificar o eliminar un campo de una tabla

-- // ------------
-- PROPIEDADES ACID
-- hace referencia a la manipulacion en la tabla
-- => ATOMICITY : garantiza que despues de la transaccion el trabajo se complete con exito, de lo contrario se revierte
-- => COHERENCE : garantiza que despues de la transaccion la BBDD cambia correctamente
-- => ISOLATION : el aislamiento permite que las transacciones funcionen de forma independiente y transparente entre si
-- => DURABILITY : asegura que el efecto de una transaccion que ya esta comprometida va a persistir en caso de falla de sistema

-- // ----------
-- MyISAM
-- => Se establece por defecto cuando se crea una tabla, salvo que se especifique lo contrario.
-- => Soporta transacciones, realiza bloqueos de registros, soporta un gran número de consultas SQL.
-- => No es capaz de realizar un bloqueo de tabla, algo que podría ser un problema si tenemos un acceso simultáneo de
-- => usuarios que quieran cambiar demasiados registros en ese preciso momento.

-- InnoDB
-- => Tiene bloqueo de registros. 
-- => Es capaz de soportar transacciones e integridad de datos, es decir, previene que ingresen datos no deseados.
-- => Aplica las características propias de ACID, para garantizar la integridad de las tablas.
-- => Una desventaja que se podría nombrar es que exige un buen diseño en el ecosistema de sus tablas, por ende,
	-- eso significa que la creación o almacenamiento de la información va a ser “más” lento.

-- ** Actualmente lo que mas se usa es InnoDB **
-- A partir de la versión 4.0 MySQL da soporte por defecto a tablas de tipo InnoDB

-- // --------------------------------------------------------------------------------------
-- CONFIRMACION DE UNA TRANSACCION
-- => los comandos DML, INSERT, UPDATE y DELETE son los encargados de mantener un control transaccional
-- => una transaccion se puede iniciar con START, persiste hasta encontrarse con COMMIT o ROLLBACK
-- => ROLLBACK : se ejecuta automaticamente si hay falla en sistema o BBDD.
			-- Se utiliza para deshacer transacciones que aun no se han cargado a la BBDD, despues del ultimo COMMIT
-- => COMMIT : se usa para guardar los cambios invocados por la transaccion
-- => AUTOCOMMIT : antes venía por defecto activado, ya no se usa en InnoDB
