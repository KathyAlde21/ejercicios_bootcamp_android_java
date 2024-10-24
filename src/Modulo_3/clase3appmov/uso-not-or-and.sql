-- AND - OR - NOT
SELECT Continent FROM country;

-- NOT
SELECT *
FROM country
WHERE NOT Continent = 'South America'; -- todos menos sudamerica

-- OR
SELECT *
FROM country
WHERE Continent = 'South America'
OR Continent = 'North America'; -- solo norteamerica y sudamerica

SELECT *
FROM country
WHERE Continent = 'South America'
OR Continent = 'North America'
ORDER BY LifeExpectancy DESC;

-- AND
SELECT *
FROM country
WHERE Continent = 'Oceania'
AND Region = 'Polynesia'
ORDER BY LifeExpectancy DESC; -- selecciono solo Polynesia dentro de Oceania - 10 datos
