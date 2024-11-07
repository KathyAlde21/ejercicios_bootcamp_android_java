-- TEORIA

-- // --------------------------------------------------------------------------------------------------------------
-- PROCESO DE ABSTRACCION
-- => habla sobre el comprender que es lo que se requiere diseñar en la base de datos, no es lo mismo que crear tablas
	-- y comenzar a enlazarlas unas a otras. Es necesario aplicar lógica y lo que realmente se espera de la BBDD
-- => Una BBDD mal diseñada se traduce en problemas de implementación, haciendo que el manejo de la información
	-- sea inexacta y el trabajo será doble para solucionar esos problemas
-- => para montar uan BBDD solida se necesita:
	-- almacenar los datos necesarios para respaldar la información que se requiere en todos los procesos de un proyecto.
		-- las tablas se crean de manera adecuada y eficiente. Cada una representa un solo tema, no redunda en los datos, y
		-- está representada correctamente por su llave primaría.
    -- Se garantiza la integridad de los datos ingresados, por eso es importante saber que datos vamos a recibir
    -- Su estructura y diseño permiten que en un futuro pueda existir un correcto crecimiento de la misma. Nunca se sabe
		-- y por eso es necesario ponerse el parche antes de la herida. Debe quedar hecha para agregar nuevos productos,
        -- sistemas de pago (por ej si es comercio), tablas, etc

-- // --------------------------------------------------------------------------------------------------------------
-- MODELO CONCEPTUAl
-- => este metodo tradicional de diseño consta de tres fases:
		-- 1) Analisis de requisitos
        -- 2) Modelado de datos
        -- 3) Normalización
-- => fase de analisis: consta de entrevistas y evaluaciones realizadas al modelo de negocio que tiene el proyecto
-- => modelado de datos: se lleva a cabo mediante un diagrama de "entidad-relacion" (ER), mostrando graficamente
	-- la estructura de la BBDD y sus relaciones
    
	-- 	-> los rectangulos representan las tablas
    -- 	-> el diamante representa la relacion entre tablas
    -- 	-> la linea vertical indica que el cliente debe estar asociado a un agente, no necesariamente debe
		-- estar asociado a un cliente    
-- => normalizacion: va a ser el proceso de descomponer tablas grandes en otras mas pequeñas para mantener la
		-- atomicidad de los datos
    -- no siempre es necesario llegar a la tercera forma normal, es necesario ver el tamaño y necesidades del
		-- proyecto
    -- lo importante es que las relaciones tengan sentido y evitar la redundancia de datos en la BBDD
  
