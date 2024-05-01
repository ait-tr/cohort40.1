const express = require('express')
const cors = require('cors');
const fs = require('fs');
const path = require('path');

const app = express();
const port = 3000

// убираем CORS - говорим что могут все стучаться
app.use(cors());

// говорим что json - будет парсить
app.use(express.json());



// @ гет запрос HELLO WORLD
app.get('/', (req, res) => {
    res.send('Hello World!')
});


// отправить на фронт все данные из файла myjsonfile.json
app.get('/api/persons', (req, res) => {
    const data = readDataFromFile();
    res.json(data);
});

// поиск по id
app.get('/api/persons/:id', (req, res) => {

    const personId = +req.params.id;

    const data = readDataFromFile();

    const finded = data.find(item => item.id === personId);

    res.json(finded);
});



// сохраняем данные в json файл
app.post('/api/persons', (req, res) => {

    const newUserData = req.body;

    const data = readDataFromFile();

    const idList = data
        // .filter(item => !!item.id)
        .filter(item => Boolean(item.id))
        .map(item => item.id);

    const newId = idList.length ? Math.max(...idList) + 1 : 1;
    newUserData.id = newId;

    data.push(newUserData);

    let json = JSON.stringify(data);
    fs.writeFile(path.resolve(__dirname + '/myjsonfile.json'), json, (err) => {
        if (err) {
            throw err;
        }
        console.log('data saved success');
    });

    res.json(newUserData);
})

function readDataFromFile() {

    const filename = path.resolve(__dirname + '/myjsonfile.json');

    const fileStr = fs.readFileSync(filename);
    const data = JSON.parse(fileStr);
    return data;
}



app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})