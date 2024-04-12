// вывод в html текста
// document.writeln('hello world');
// window.document.writeln('hello world');

// создаем элемент div
const div1 = document.createElement('div');

// добавляем контект (текст) для элемента div
div1.innerText = 'div1';
div1.id = 'my-id-2';
div1.className = 'test111';
// добавить кастомный атрибут
div1.setAttribute('test', 'xxx');

// можно вывести в консоль элемент html
// console.log(div1);

// добавляем созданный элемен на страницу
document.body.appendChild(div1);

// создаем и добавляем на страницу заголовок 1 уровня (h1)
const h1 = document.createElement('h1');
h1.innerText = 'Заголовок 1 уровня';
document.body.appendChild(h1);

// -------------

// Положили h2 внутрь div (предварительно создав оба элеимента)
const div2 = document.createElement('div');
const h2 = document.createElement('h2');
h2.innerText = 'привет';


div2.appendChild(h2);

document.body.appendChild(div2);

// ----------------

// получить элемент по id
const myDiv1 = document.getElementById('my-div-id');
// console.log(myDiv1);

// получили список элементов с классом my-div-class
const myDivList = document.getElementsByClassName('my-div-class');
// console.log(myDivList);

// получаем элементы по тегу (список)
const myDivList2 = document.getElementsByTagName('div');
// console.log(myDivList2);

// ----------------
const div3 = document.getElementById('my-div-id');

// добавить класс к элементу (перетрет другие классы)
// div3.className = 'test';

// добавить класс 
div3.classList.add('test');

// console.log(div3);

// ----------


// добавление строки в виде html внутрь элемента
const ul1 = `
    <ul>
        <li class='test'>item1</li>
        <li>item2</li>
    </ul>
`;

const div4 = document.getElementById('my-div-id');
div4.innerHTML = ul1;

// -----------
const div5 = document.querySelector('.my-div-class');

const div6 = document.querySelectorAll('.my-div-class');
const div7 = document.querySelector('#my-div-id');
// console.log(div7);


// удаление элемента через фызов функции
const deleteElement = () => {
    const divForDelete = document.getElementById('my-div-id');
    divForDelete.remove();
}
const deleteAllDivs = () => {
    const divs = document.querySelectorAll('div');
    

    for (let i = 0; i < divs.length; i++) {
        const currentDiv = divs[i];
        console.log(currentDiv);
        currentDiv.remove();
    }
}