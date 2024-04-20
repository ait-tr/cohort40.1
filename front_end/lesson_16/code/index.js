let todoItems = [
    // { id: '1', name: 'Купить молоко1', isDone: false },
    // { id: '2', name: 'Купить молоко2', isDone: false },
    // { id: '3', name: 'Купить молоко3', isDone: false },
];

const showTodoItems = () => {

    const todoItemsListHtml = document.getElementById('todo-list-items');
    todoItemsListHtml.innerHTML = '';

    let divTodoHtml = ''

    for (let item of todoItems) {

        const todoItemHtml = `
                <div class="todo-item">
                    <p>${item.name}</p>
                    <button class="delete-todo-item" data-todo-id="${item.id}" >удалить</button>
                </div>
            `;

        // todoItemsListHtml.innerHTML = todoItemsListHtml.innerHTML + todoItemHtml;
        divTodoHtml += todoItemHtml;
    }

    todoItemsListHtml.innerHTML = divTodoHtml;

    const deleteTodoButtons = document.getElementsByClassName('delete-todo-item');

    for (let btn of deleteTodoButtons) {
        btn.addEventListener('click', (e) => {
            todoItems = deleteTodoItem(e.target.dataset.todoId);
            showTodoItems();
        });
    }
}

// showTodoItems();

const deleteTodoItem = (id) => {
    const res = todoItems.filter(item => item.id.toString() !== id);
    return res;
}

// --------------

// добавить новый элемент todo
const addTodo = (todoName = '') => {
    const newTodo = { id: Math.random(), name: todoName, isDone: false };
    console.log(newTodo);
    todoItems.push(newTodo);
    showTodoItems();
}

const addTodoBtn = document.getElementById('add-todo-btn');
const addTodoInput = document.getElementById('add-todo-input');
addTodoBtn.addEventListener('click', () => {
    const newTodoName = addTodoInput.value;
    addTodo(newTodoName)
});
