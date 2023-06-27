/* Escribe una consulta SQL que devuelva una lista de usuarios junto con los nombres de sus amigos. */

SELECT users.first_name, users.last_name, users2.first_name AS friend_first_name, users2.last_name AS friend_last_name FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
LEFT JOIN users as users2 ON  users2.id = friendships.friend_id;

/* Ejercicio Adicional */

/*1. Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados. */

SELECT users2.first_name, users2.last_name , CONCAT(users.first_name,' ',users.last_name) AS friends_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
LEFT JOIN users as users2 ON users2.id = friendships.friend_id
WHERE users2.first_name = 'Kermit';

/*2. Devuelve el recuento de todas las amistades. */

SELECT COUNT(users2.id) AS total_friendships FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
LEFT JOIN users as users2 ON  users2.id = friendships.friend_id;

/*3. Descubre quién tiene más amigos y devuelve el recuento de sus amigos. */

SELECT users.first_name, users.last_name ,COUNT(users2.id) AS total_friendships FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
LEFT JOIN users as users2 ON  users2.id = friendships.friend_id
GROUP BY users.id;

/*4 Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark. */
INSERT INTO users (first_name, last_name)
VALUES ('Sebastian', 'Gonzalez');

SELECT users.id, users.first_name, friendships.user_id, friendships.friend_id FROM users
LEFT JOIN friendships ON friendships.user_id = users.id;

INSERT INTO friendships (user_id)
VALUES ( 6);

INSERT INTO friendships (user_id, friend_id)
VALUES ( 4, 6);

INSERT INTO friendships (user_id,friend_id)
VALUES (6, 4);

INSERT INTO friendships (user_id,friend_id)
VALUES (6,5);

INSERT INTO friendships (user_id,friend_id)
VALUES (6,2);

/*5. Devuelve a los amigos de Eli en orden alfabético. */
SELECT users2.first_name, users2.last_name , CONCAT(users.first_name,' ',users.last_name) AS friends_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
LEFT JOIN users as users2 ON users2.id = friendships.friend_id
WHERE users2.first_name = 'Eli'
ORDER BY CONCAT(users.first_name,' ',users.last_name) ASC;

/*6. Eliminar a Marky Mark de los amigos de Eli. */
DELETE FROM friendships 
WHERE user_id = 5;

SELECT friendships.id, users.first_name from friendships
JOIN users ON users.id = friendships.user_id;
/*7. Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos */

SELECT CONCAT(users.first_name,' ', users.last_name,' and ', users2.first_name,' ', users2.last_name) AS friends from friendships
JOIN users ON users.id = friendships.user_id
JOIN users AS users2 ON users2.id = friendships.friend_id;

