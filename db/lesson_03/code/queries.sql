-- ! перед командами не ставятся запятые!!
-- ! когда перечисление заканчивается - последняя запятая лишняя и приводит к ошибке


-- lesson 3

-- получение данных из связной таблицы
-- many-to-many
-- alias (псевдоним) мы назначаем с помощью AS, для удобного вывода
-- STRING_AGG() - функция для сложения строк


SELECT
  book.title,
  book.author,
  STRING_AGG(genre.title, ', ') AS genres
FROM
  book
  JOIN book_genre ON book.id = book_genre.book_id
  JOIN genre ON book_genre.genre_id = genre.id
WHERE
  book.id = 1
GROUP BY
  book.title,
  book.author;


-- пример группировки и использования операторов агрегации
-- вы можете использовать
-- COUNT() расчет ко-ва строк
-- AVG() расчет сред/ариф. знач.
-- MAX() расчет макс. значения
-- MIN() расчет мин. значения
-- SUM() расчет суммы


SELECT
  race,
  MIN(age) AS min_age_of_brotherhood,
  MAX(age) AS max_age_of_brotherhood
FROM
  brotherhood
GROUP BY
  race;


-- если мы хотим вывести особое условие для группировки
-- мы используем ключевое слово HAVING


SELECT
  race,
  COUNT(id)
FROM
  brotherhood
GROUP BY
  race
HAVING
  COUNT(id) > 1;


-- оператор LIKE проверяет вхождение подстроки в строку и выводит подходящие
-- wildcard % заменяет несколько символов в строке


SELECT
  *
FROM
  brotherhood WHERE name LIKE 'F%';


-- через оператор CONSTRAINT можно создавать именные ограничения
-- CHECK задает особое условие для значения
-- UNIQUE поверяет уникальность значения в поле
-- NOT NULL - не дает записать в значения NULL

 CREATE TABLE
  horse (
    id serial PRIMARY KEY,
    age integer NOT NULL,
    color varchar(60),
    name varchar(20) UNIQUE,
    brother_id integer REFERENCES brotherhood (id) ON DELETE CASCADE,
    CONSTRAINT horse_age CHECK (age > 2),
    CONSTRAINT horse_color CHECK (color != 'black')
 );

-- запись ON DELETE CASCADE для ключа с REFERENCES в создании связной таблицы
-- даст нам возможность удалить запись в таблице источнике,
-- а связанная запись удалится вслед за ней


INSERT INTO
  horse (age, color, name, brother_id)
VALUES
  (3, 'white', 'Spirit', 4);


-- удаление элемента из таблице по id


DELETE FROM brotherhood WHERE id=4;


-- задание на самостоятельную работу

-- создайте новые таблицы:

-- 1. две со связью между ними one-to-many
-- 2. три со связью many-to-many

-- заполните их значениями
-- получите значения через join

-- используйте GROUP BY, HAVING, LIKE, CHECK

