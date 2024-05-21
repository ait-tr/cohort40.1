
// --------

// работа с json - преобразование строки в объект js
// const data = JSON.parse(`{
//     "type": "general",
//     "setup": "What kind of award did the dentist receive?",
//     "punchline": "A little plaque.",
//     "id": 255
// }
// `);


// объект js преобразовали в json строку
// const pers = {
//     name: 'bob',
//     age: 22
// }

// const persJsonStr = JSON.stringify(pers);

// console.log(persJsonStr);


// --------------

//  запрос к паблик апи random_joke ( по умолчанию метод GEt )
// fetch('https://official-joke-api.appspot.com/random_joke')
//     .then(response => {
//         return response.json();
//     }).then(data => {
//         console.log(data);
//     });

// обращение к гитхаб репозиторию
// let url1 = 'https://api.github.com/repos/SergeyRazin2014/ait-frontend/commits';
let url1 = 'https://catfact.ninja/fact';

// fetch(url1)
//     .then(response => {
//         return response.json();
//     }).then(data => {
//         console.log(data);
//     });


// const loadDagta = ()=>{
//     fetch(url1)
//     .then(response => {
//         return response.json();
//     }).then(data => {
//         console.log(data);
//     });
// }

// loadDagta();





const data = `{
    "type": "general",
    "setup": "What kind of award did the dentist receive?",
    "punchline": "A little plaque.",
    "id": 255,
    file: 'xcas2435gqsdagdfasdfasdfasdf'
}`;