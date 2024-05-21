Установка сервера и Beekeeper Studio

Обсудили что такое БД и СУБД

Разборали, что такое таблица, строки, столбцы, primary key, нормализация в общих словах:
[ссылка на таблицу](https://docs.google.com/spreadsheets/d/1mn1_AQoMEw9CAwJrS5kxwCJSXG5YbZRdVx-21i8r-24/edit?hl=de#gid=0)


```sql
CREATE USER
  dmitrii
WITH
  PASSWORD 'qwerty007';
```


```sql
CREATE DATABASE
  lesson_1 OWNER dmitrii;
```

```sql
CREATE TABLE
  student (
    id serial PRIMARY KEY,
    name varchar(80),
    age integer,
    hobby varchar(80),
    profession varchar(80)
  );
```

```sql
INSERT INTO
  student (name, age, hobby, profession)
VALUES
  ('Ilya', 45, 'fishing', 'singer'),
  ('Alina', 32, 'traveling', 'nurse'),
  ('Ekaterina', 38, 'photography', 'economist'),
  ('Yulia', 34, 'photography', 'photography');
```

```sql
SELECT
  name,
  hobby
FROM
  student;
```

```sql
SELECT
  name
FROM
  student
WHERE
	age < 32;
```


```sql
DELETE FROM student;
```
```sql
DELETE FROM
  student
WHERE
  age = 60
  OR hobby = 'sport';
```
```sql
DELETE FROM student WHERE hobby = 'photography';
```

```sql
SELECT
  name,
  age FROM
  student
ORDER BY
  age DESC;
```

```sql
UPDATE
  students
SET
  age = 30
WHERE
  name = 'Ilya';
```
