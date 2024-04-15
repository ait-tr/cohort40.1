const myBtn1 = document.getElementById('myBtn');


// кнопку myBtn1 подписали на событие клик ( кнопка myBtn1 является слушателем события клик)
// фукнция внутри addEventListener - является обработчиком события клик
myBtn1.addEventListener('click', function () {
    console.log('click event');
});

// вариант подписки на событие клик через стрелочную функцию (тоже самое что и выше)
myBtn1.addEventListener('click', () => {
    console.log('click event 2');
});

const func1 = () => {
    console.log('click event 3');
}

// подписка на событие отдельной функции
myBtn1.addEventListener('click', func1);

// отписка от события
myBtn1.removeEventListener('click', func1);

// ----------------

// аргумент в функции обработчике - это объект события
myBtn1.addEventListener('click', (event) => {
    // установка точки останова через код
    // debugger;

    // event.target - получить источник события (в данном случае кнопка)
    event.target.innerText = 'TEST';
    console.log('click event 4 (event object)');
});

// повесили событие фокус на инпут
const input1 = document.getElementById('myInput');
input1.addEventListener('focus', () => {
    console.log('focus event');
})

// повесили событие клик на див
const myDiv1 = document.getElementById('myDiv');
myDiv1.addEventListener('click', () => {
    console.log('click by div');
});

// событие blur ( потеря фокуса )
const input2 = document.getElementById('myInput');
input1.addEventListener('blur', () => {
    console.log('blur event');
})

// событие mouseover - срабаытвает когда курсор мыши над элементом
const input3 = document.getElementById('myInput');
input1.addEventListener('mouseover', () => {
    console.log('mouseover event');
});

// событие mouseleave - срабаытвает когда курсор мыши уходит из элемента
const input4 = document.getElementById('myInput');
input1.addEventListener('mouseleave', () => {
    console.log('mouseleave event');
    // alert('не уходи');
});