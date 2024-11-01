SELECT * FROM usuarios_lenguajes;

-- muchos es a muchos, como son numero los id INT es una tabla con solo números

-- un usuario puede tener vario lenguajes y un lenguaje puede tener varios usuarios
INSERT INTO usuarios_lenguajes (fk_id_usuario, fk_id_lenguaje)
VALUES (1, 1), (1, 2), -- usuario 1 conoce Java y Kotlin
(2, 4), -- usuario 2 conoce Python
(3, 2), (3, 3), (3, 4), -- usuario 3 sabe Kotlin, JavaScript y Python
(4, 5), (4, 4) ; -- usuario 4 sabe C++ y Python