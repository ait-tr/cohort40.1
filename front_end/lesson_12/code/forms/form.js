// получить список всех форм
const allForms = document.forms;
// console.log(allForms);

// получить форму по индексу
const firstForm = allForms[0];
// console.log(firstForm);

// получили форму по id 
const form1 = document.getElementById('myForm');
// console.log(form1);

// получение формы по имени
const form2 = document.forms.myFormName;
// console.log(form2);

// -------------

// получение всех элементов формы
const form3 = document.forms.myFormName;
// console.log(form3.elements);

// получение элемента формы по имени
const form4 = document.forms.myFormName;
// console.log(form4.elements.login);

// получение элемента формы по имени элемента без elements
const form5 = document.forms.myFormName;
// console.log(form5.login);

const form6 = document.forms.myFormName;
// form6.login.value = 'test'; // обращение к инпуту по id
form6.loginName.value = 'test2'; // обращение к инпуту по имени (более предпочтительно)

// получение значения инпута через имя и value
const btn = document.getElementById('btn');
// btn.addEventListener('click', () => {
//     const form = document.forms.myFormName;
//     console.log(form.loginName.value);
// });

// получение радиокнопопк через имя группы кнопопк
const form = document.forms.myFormName;
// console.log(form.gender);

//
const form7 = document.forms.myFormName;


// btn.addEventListener('click', () => {
//     const form = document.forms.myFormName;
//     // получение значения радиокнопок
//     // console.log(form.gender.value);
// });

btn.addEventListener('click', () => {
    const form = document.forms.myFormName;
    console.log(form.gender.value = 'female');
});

const submit = document.getElementById('submitBtn');

// отменяем событие отправки формы через клик
// submit.addEventListener('click',(e)=>{
//     console.log('все хорошо');
//     // отменить стандартное поведение
//     e.preventDefault();

// });

const form9 = document.forms.myFormName;
form9.addEventListener('submit', (e) => {
    e.preventDefault();
    console.log('все хорошо');
    
    // отправить даныне на серве с помощью джава скрипта (пока не изучали)
    // ...
})

// посчитать корень
Math.sqrt(9)
