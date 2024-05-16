// подключение к текущей бд
use("student_db")

// создали коллекцию со строкой
// id - уникальный сгенерированный хэш код
// db.students.insertOne({name: 'Dmitrii'})

// пример вложенности 
// db.students.insertOne({name: 'Donald', age:35, address: {country: 'Germany', city: 'Berlin'}})

// пример записи нескольких объектов в коллекцию
// db.students.insertMany([
//   {name:'Alena', hobby: 'Travel'},
//   {name: 'Eugen', profession: 'Work with wood',}
// ])

// запись одного объекта с несколькими значениями у одного ключа (массив)
// db.students.insertOne({
//   name:'Harry',
//   hobby: ['Magic', 'Flying', 'Traveling', 'Battle with Evil']
// })

// вывести значения всей коллекции
db.students.find()

// ограничение выдачи по кол-ву
// db.students.find().limit(2)

// поиск с сортировкой - в скобках указываете условие сортировки
// сначала нашли всех
// потом отсортировали
// и взяли двоих 
//db.students.find().sort({_id: -1}).limit(2)

// -1 - это сортировка в обратном порядке
// db.students.find().sort({name: -1})

// находим первый документ удовлетворяющий условию
// db.students.findOne({hobby: "Travel"})

//db.students.insertOne({name: 'Indiana Jones', hobby: 'Travel'})


db.students.find({hobby: "Travel"})