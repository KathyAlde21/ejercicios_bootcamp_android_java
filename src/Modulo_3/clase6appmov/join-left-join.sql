-- LEFT JOIN
-- **se queda con todos los datos comunes y no tan comunas entre dos tablas
SELECT* FROM tabla_A
LEFT JOIN tabla_B
ON tabla_A.primary_key = tabla_B.foreign_key;



-- 	RIGHT JOIN
-- **se queda con todos los datos comunes y no tan comunas entre dos tablas
SELECT* FROM tabla_A
RIGHT JOIN tabla_B
ON tabla_A.primary_key = tabla_B.foreign_key;

