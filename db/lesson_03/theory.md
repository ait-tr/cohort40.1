# Операторы

#### `=` равенство
#### `<` меньше
#### `>` больше
#### `<=` меньше или равно
#### `>=` больше или равно
#### `<>` не равно
#### `!=` не равно

#### `LIKE` проверяет соответствует ли значение определенному патерну(чувстивтельно к регистру)

#### `ILIKE` проверяет соответствует ли значение определенному патерну(без учета регистра)

#### `AND` логическое `и`

#### `OR` логическое `или`

#### `IN` проверяет находится ли значение внутури диапазона значений (равнозначно нескольким условиям)

#### `BETWEEN` проверяет находится ли значение внтури диапазона значений

#### `IS NULL` проверяет является ли значение NULL-ом

#### `NOT` в комбинации с другими операторам позволяет формулировать отрицательные условия `NOT LIKE`, `NOT IN`, `NOT BETWEEN`

## Aggregation - получение вычисленных данных (итоги, статистика, аналитика)

### Базовые операторы агрегации
- COUNT() расчет ко-ва строк
- AVG() расчет сред/ариф. знач.
- MAX() расчет макс. значения
- MIN() расчет мин. значения
- SUM() расчет суммы

## GROUP BY
Выводит данные сгруппированные по опредленному значению, например по стране.
```
  SELECT
  country,
  MIN(age) AS min_age
FROM
  farmer
GROUP BY
  country;
```
## HAVING
Если требуется задать уточнение после group by:
```sql
  SELECT
  country,
  COUNT(id)
FROM
  farmer
GROUP BY
  country
HAVING COUNT(id) >= 2;
```


# Ограничения (Constraints)

Типы данных — это способ ограничить тип данных, которые могут храниться в таблице. Однако для многих приложений ограничение, которое они обеспечивают, слишком грубое. Например, столбец, содержащий цену продукта, вероятно, должен принимать только положительные значения. Но не существует стандартного типа данных, который принимает только положительные числа. Другая проблема заключается в том, что вам может потребоваться ограничить данные столбца относительно других столбцов или строк. Например, в таблице, содержащей информацию о продукте, для каждого номера продукта должна быть только одна строка.

С этой целью SQL позволяет вам определять ограничения для столбцов и таблиц. Ограничения дают вам столько контроля над данными в ваших таблицах, сколько вы пожелаете. Если пользователь пытается сохранить данные в столбце, который нарушает ограничение, возникает ошибка. Это применимо, даже если значение получено из определения значения по умолчанию.

## CHECK

Check ограничение — это наиболее общий тип ограничения. Он позволяет указать, что значение в определенном столбце должно удовлетворять какому-то условию.
Иными словами, с помощью check мы можем `проверить` удовлетовряет ли значение условию.

В этом примере мы создадим таблицу, где цена может быть только положительной.

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric CHECK (price > 0)
);
```

Вы также можете дать ограничению отдельное имя. Это проясняет сообщения об ошибках и позволяет вам обращаться к ограничению, когда вам нужно его изменить. Синтаксис:

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric CONSTRAINT positive_price CHECK (price > 0)
);
```

Внутри ограничения check можно ссылаться на несколько полей:

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric CHECK (price > 0),
    discounted_price numeric CHECK (discounted_price > 0),
    CHECK (price > discounted_price)
);
```

Пример альтернативного синтаксиса:

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric,
    CHECK (price > 0),
    discounted_price numeric,
    CHECK (discounted_price > 0),
    CONSTRAINT valid_discount CHECK (price > discounted_price)
);
```

Следует отметить, что проверочное ограничение считается удовлетворенным, если проверочное выражение имеет значение `true` или `NULL`. Поскольку большинство выражений будут иметь значение `NULL`, если какой-либо операнд имеет нулевое значение, они не предотвратят появление нулевых значений в ограниченных столбцах. Чтобы гарантировать, что столбец не содержит нулевых значений, можно использовать ограничение not-null.

## NOT NULL

Показывает, что в столбце не может быть значения null.

```sql
CREATE TABLE product (
    serial integer NOT NULL,
    name text NOT NULL,
    price numeric
);
```

Возможно указать несколько ограничений для столбца, их просто следует перечислить одно после другого.

```sql
CREATE TABLE product (
    serial integer NOT NULL,
    name text NOT NULL,
    price numeric NOT NULL CHECK (price > 0)
);
```

## UNIQUE

Ограничение уникальности гарантирует, что данные, содержащиеся в столбце или группе столбцов, уникальны среди всех строк таблицы. Синтаксис:

```sql
CREATE TABLE product (
    id integer UNIQUE,
    name text,
    price numeric
);
```

Можно указать несколько свойств сразу:

```sql
CREATE TABLE example (
    a integer,
    b integer,
    c integer,
    UNIQUE (a, c)
);
```

Если есть желания проименовать ограничение - то синтаксис будет таким же как обычно:

```sql
CREATE TABLE product (
    id serial,
    name text CONSTRAINT must_be_different UNIQUE,
    price numeric
)
```

В этом случае, если мы захотим добавить две строки с одинаковыми именами ошибка будет содержать указанное имя ограничения:

```sql
duplicate key value violates unique constraint "must_be_different"
```

## PRIMARY KEY

Ограничение первичного ключа указывает, что столбец или группа столбцов могут использоваться в качестве уникального идентификатора строк в таблице. Для этого необходимо, чтобы значения были уникальными и не были нулевыми. Итак, следующие два определения таблицы принимают одни и те же данные:

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);
```

Если несколько столбцов являются первичными ключами - синтаксис будет такой же как в случае с unique:

```sql
CREATE TABLE example (
    a integer,
    b integer,
    c integer,
    PRIMARY KEY (a, c)
);
```

## FOREIGN KEY

Ограничение внешнего ключа указывает, что значения в столбце (или группе столбцов) должны соответствовать значениям, появляющимся в некоторой строке другой таблицы. Мы говорим, что это поддерживает ссылочную целостность между двумя связанными таблицами.

Допустим, у вас есть таблица продуктов, которую мы уже использовали несколько раз:

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);
```

Предположим также, что у вас есть таблица, в которой хранятся заказы на эти продукты. Мы хотим, чтобы таблица заказов содержала только заказы на действительно существующие товары. Поэтому мы определяем ограничение внешнего ключа в таблице заказов, которое ссылается на таблицу продуктов:

```sql
CREATE TABLE orders (
    order_id integer PRIMARY KEY,
    product_no integer REFERENCES products (product_no),
    quantity integer
);
```

Теперь невозможно создавать заказы с non-NULL product_no, которыго бы не было ранее в таблице продуктов.

Мы говорим, что в этой ситуации таблица заказов является ссылаюшейся таблицей, а таблица продуктов — та на которую ссылаются. Аналогичным образом существуют ссылающиеся и ссылочные столбцы.

## ON DELETE CASCADE

ON DELETE CASCADE — это опция, которую можно использовать при определении ограничения внешнего ключа. Если указано ON DELETE CASCADE, Postgres автоматически удаляет любую строку в дочерней таблице, которая ссылается на удаленную строку из родительской таблицы.

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);

CREATE TABLE orders (
    order_id integer PRIMARY KEY,
    shipping_address text,
    ...
);

CREATE TABLE order_items (
    product_no integer REFERENCES products ON DELETE RESTRICT,
    order_id integer REFERENCES orders ON DELETE CASCADE,
    quantity integer,
    PRIMARY KEY (product_no, order_id)
);
```

Еще один пример:

```sql
INSERT INTO
  employees (name)
VALUES
  ('Alice'),
  ('Bob'),
  ('Carol'),
  ('David');

INSERT INTO
  departments (employee_id, department_name)
VALUES
  (1, 'Sales'),
  (2, 'Marketing'),
  (3, 'Accounting'),
  (1, 'Marketing');

DELETE FROM employees WHERE id = 1;
```

## Псевдонимы (alias) в SQL / Оператор AS

```sql
SELECT
        ProductName,
    Price AS Price_eur,
    Price * 1.1 AS Price_usd
FROM Products
```

```sql
SELECT *,
    Price * 1.1 AS Price_usd
FROM Products
```

```sql
SELECT *,
    Price * .95 AS Price_down
FROM Products
```
