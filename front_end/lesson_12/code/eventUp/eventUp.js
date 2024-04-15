const btn = document.getElementById('btn');
btn.addEventListener('click', (e) => {
    console.log('btn click');

    // отключаем всплытие события
    e.stopPropagation();
    // e.stopImmediatePropagation();
});

const wrapper = document.getElementById('wrapper');
wrapper.addEventListener('click', (e) => {
    console.log('div click');
    e.stopPropagation();
});


document.body.addEventListener('click', (e) => {
    console.log('body click');
})
