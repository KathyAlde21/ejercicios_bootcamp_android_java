-- TEORIA

-- // --------------------------------------------------------------------------------------------------------------
-- IDENTIFICACION DE ENTIDADES
-- => hace referencia a la llave primaria de la tabla, que es fundamental para cada tabla ya que la va a representar
	-- ante otras tablas (llave foranea)

-- // --------------------------------------------------------------------------------------------------------------
-- DEFINICION DE ATRIBUTOS E IDENTIFICADORES UNICOS

-- => Entidad: es aquello sobre lo que vamos a almacenar los datos
	-- a pesar de no es tangible, va a tener atributos que si almacenan los datos y ayudan a representar el "todo"
    -- en la BBDD cuando almacenamos los datos en realidad estamos llenando los atributos que van a representar
		-- a una entidad en especifico
	-- ej: cliente en una entidad eascrita por id_cliente; información de productos sku; entre otras opciones
		-- dependiendo del uso que se va a sar a la BBDD
-- => un padre puede tener muchos hijos, un hijo solo un padre... un hijo puede uno o muchos hermanos, esto se traduce
	-- en relaciones uno es a uno, uno a muchos, muchos a muchos

-- // --------------------------------------------------------------------------------------------------------------
-- TIPOS DE RELACIONES ENTRE ENTIDADES
-- => puede ser 1:1, 1:N y N:M

-- => Entidad fuerte: no depende de otras
	-- siempre va a tener una clave primaria
    
-- => Entidad debil: depende de una entidad fuerte para existir, su clave primaria se llama discriminatoria parcial, se
	-- escribe como llave primaria, se ve como llave primaria pero por ser debil se llama asi

-- => en una tabla una entidad puede ser debil y en la otra fuerte
