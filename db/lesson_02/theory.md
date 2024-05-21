# Как связать таблицы в PostgreSQL и получить нужные данные?

Связывание таблиц в PostgreSQL осуществляется с помощью оператора JOIN. Оператор JOIN позволяет объединять строки из двух или более таблиц в зависимости от заданных условий.

## Внешний ключ

Для связывания таблиц в PostgreSQL используются внешние ключи. Внешний ключ в таблице связывает ее с другой таблицей, указывая идентификатор связанной записи.

## Способы связывания таблиц

### Один-к-одному (One-to-One)

Каждая запись в одной таблице связана с одной записью в другой таблице.

<img src="https://www.datensen.com/blog/wp-content/uploads/2021/10/one-to-one-relationship-b.png">

### Один-ко-многим (One-to-Many)

Каждая запись в одной таблице связана с несколькими записями в другой таблице.

<img src="https://www.datensen.com/blog/wp-content/uploads/2021/10/one-to-many-relationship.png">

### Многие-ко-многим (Many-to-Many)

Каждая запись в одной таблице может быть связана с несколькими записями в другой таблице, и наоборот.

<img src="https://www.datensen.com/blog/wp-content/uploads/2021/10/many-to-many-relationship-1.png">

## Примеры связи

### Один-к-одному (One-to-One)

```sql
CREATE TABLE employees (
  id integer PRIMARY KEY,
  name varchar(100)
);

CREATE TABLE contact_info (
  employee_id integer REFERENCES employees(id) UNIQUE,
  email text,
  phone_number varchar(9)
);
```

### Один-ко-многим (One-to-Many)

```sql
CREATE TABLE orders (
  order_number integer,
  customer_id integer REFERENCES customers(id),
);

CREATE TABLE customers (
  id integer PRIMARY KEY,
  name text
);
```

### Многие-ко-многим (Many-to-Many)

```sql
CREATE TABLE songs (
  id integer PRIMARY KEY,
  name varchar(100)
);

CREATE TABLE artists (
  id integer PRIMARY KEY,
  name varchar(100)
);

CREATE TABLE songs_artists (
  artist_id integer REFERENCES artists(id),
  song_id integer REFERENCES songs(id),
  PRIMARY KEY (artist_id, song_id)
);
```

## Пример JOIN
```sql
SELECT
  *
FROM
  product
  JOIN category ON category.id = product.category_id;
```

## Преимущества связывания таблиц:

- **Исключение повторений данных**: связывание позволяет избежать дублирования информации в разных таблицах. Например, если в базе данных есть таблица «Пользователи» и таблица «Заказы», то связывание позволит связать каждый заказ с соответствующим пользователем, не дублируя информацию о пользователе в каждой записи заказа.
- **Улучшение эффективности запросов**: при связывании таблиц можно выполнять запросы, отбирая данные из нескольких таблиц одним запросом. Это уменьшает количество запросов к базе данных и повышает производительность системы.
- **Обеспечение целостности данных**: связывание таблиц позволяет определить связи между разными сущностями в базе данных и задать ограничения на значения ключевых полей. Например, при связывании таблиц «Пользователи» и «Заказы» можно задать ограничение, что каждый заказ должен быть связан с существующим пользователем.
- Связывание таблиц является одним из важнейших инструментов реляционных баз данных, таких как PostgreSQL. Оно помогает организовать структуру данных, улучшить производительность системы и обеспечить целостность информации.
