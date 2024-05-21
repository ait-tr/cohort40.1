
const getBtn = document.getElementById('get-btn');
const saveBtn = document.getElementById('save-btn');
const fileInput = document.getElementById('file-input');
const personsListBlock = document.getElementById('persons-list-block');

getBtn.addEventListener('click', () => {
    fetch('http://127.0.0.1:3000/api/persons')
        .then(response => {

            if (!response.ok) {
                throw new Error('Произошла ошибка: ', response.status);
            }

            return response.json();
        }).then(data => {
            // console.log(data);

            // personsListBlock.innerHTML = `
            //     <div>${data}</div>
            // `;

            let strHtml = '';
            data.forEach(item => {
                const personItemHtml = `
                    <div>${item.name}</div>
                    <img src='${item.img}' alt='image' />
                `

                strHtml = strHtml + personItemHtml;
            });

            personsListBlock.innerHTML = strHtml;
        }).catch(err => {
            console.log('Ошибка: ', err);
        })
});

let fileBase64 = null;

saveBtn.addEventListener('click', () => {

    const p1 = {
        name: 'bob',
        age: 44,
        img: fileBase64,
    }

    fetch('http://127.0.0.1:3000/api/persons', {
        method: 'post',
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(p1),
    });
});

// ----------



fileInput.addEventListener('change', () => {
    const file = fileInput.files[0];
    const reader = new FileReader();

    reader.addEventListener('load', () => {
        fileBase64 = reader.result;
    })

    reader.readAsDataURL(file);

})