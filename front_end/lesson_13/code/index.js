
const firstNumInput = document.getElementById('firstNum');
const secondNumInput = document.getElementById('secondNum');

let sign = null;

// подписка на событие кнопок цифр
const numButtons = document.getElementsByClassName('num');
for (let i = 0; i < numButtons.length; i++) {
    numButtons[i].addEventListener('click', (e) => {

        if (!sign) {
            firstNumInput.value += e.target.innerText;
        } else {
            secondNumInput.value += e.target.innerText;
        }
    });
}

// подписка на событие математических знаков
const signButtons = document.getElementsByClassName('sign');
for (let i = 0; i < signButtons.length; i++) {
    signButtons[i].addEventListener('click', (e) => {
        sign = e.target.innerText;
    });
}

// подписка события кнопки равно
const resBtn = document.getElementById('res');
resBtn.addEventListener('click', () => {
    const firstVal = parseInt(firstNumInput.value);
    const secondVal = parseInt(secondNumInput.value);
    const res = calculate(firstVal, secondVal, sign);
    console.log(res);
});



// 
const calculate = (a, b, sign) => {
    switch (sign) {
        case '+':
            return a + b;


        default:
            break;
    }
}



// const res = calculate(1, 2, '+');
// console.log(res);

//  Доработать калькулятор
//  1) Реализовать функционал кнопок:
//  - / *  AC

//  2) Написать фукнционал очистки значений инпутов после нажания на кнопку равно

//  3)* Добавить css стили для калькулятора
//  4)** Реализовать калькулятор с одним полем ввода цифр, а не двумя как сейчас