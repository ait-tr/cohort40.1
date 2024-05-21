перед командами не ставятся запятые.
когда перечисление заканчивается - последняя запятая лишняя и приводит к ошибке

получение данных из связной таблицы
many-to-many

```sql
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
```

пример группировки и использования операторов агрегации

```sql
SELECT
  race,
  MIN(age) AS min_age_of_brotherhood,
  MAX(age) AS max_age_of_brotherhood
FROM
  brotherhood
GROUP BY
  race;
```

если мы хотим вывести особое условие для группировки мы используем ключевое слово HAVING

```sql
SELECT
  race,
  COUNT(id)
FROM
  brotherhood
GROUP BY
  race
HAVING
  COUNT(id) > 1;
```

оператор LIKE проверяет вхождение подстроки в строку и выводит подходящие

```sql
SELECT
  *
FROM
  brotherhood WHERE name LIKE 'F%';
```


- задание на самостоятельную работу:


- создайте таблицы:

1. две со связью между ними one-to-many
2. три со связью many-to-many

- заполните их значениями
- получите значения через join

* когда сделаете - усложните задачу:

- удалите таблицы и перепишите используя:

1. CONSTRAINT
2. CHECK
3. NOT NULL
4. ON DELETE CASCADE
5. UNIQUE

- при выводе данных:

1. WHERE - условие вывода (используйте логические операторы)
2. AS - псевдоним
3. GROUP BY - группировка
4. HAVING - условие группировки
5. AVG() и ROUND(), MAX() или MIN()
6. LIKE - нахождение подстроки


