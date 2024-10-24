-- ORDER BY - ASC - DESC
-- ordenar por y puede ser ascendente o descendiente
SELECT Name
FROM city
WHERE CountryCode = 'CHL'
ORDER BY Name; -- de la a - z

SELECT Name
FROM city
WHERE CountryCode = 'CHL'
ORDER BY Name DESC; -- descendiente z - a

SELECT Name
FROM city
WHERE CountryCode = 'CHL'
ORDER BY Name ASC; -- descendiente a - z

SELECT Name, LifeExpectancy
FROM country
WHERE Continent = 'South America'
ORDER BY LifeExpectancy ASC;
