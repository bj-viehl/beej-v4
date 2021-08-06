const form = document.querySelector('#todo-form');
const todoList = document.querySelector('#todo-list');
const clearTasksButton = document.querySelector('.todo-clear');
const filter = document.querySelector('#filter');
const input = document.querySelector('#todo-input');

function getTasks() {
  let tasks;

  if (localStorage.getItem('tasks') === null) {
    tasks = [];
  } else {
    tasks = JSON.parse(localStorage.getItem('tasks'));
  }

  tasks.forEach((task) => {
    // Create Li Element
    const li = document.createElement('li');
    // Add Class
    li.className = 'beej-todo-list__list-item';
    // Create text node
    li.appendChild(document.createTextNode(task));
    // Create new link
    const link = document.createElement('a');
    // Add class to link
    link.className = 'beej-todo-list__list-item-delete';
    // Add icon
    link.innerHTML = '<i class="fa fa-times"></i>';
    // Append link to li
    li.appendChild(link);
    // Append li to ul
    todoList.appendChild(li);
  });
}

function addTaskLS(task) {
  let tasks;

  if (localStorage.getItem('tasks') === null) {
    tasks = [];
  } else {
    tasks = JSON.parse(localStorage.getItem('tasks'));
  }

  tasks.push(task);

  localStorage.setItem('tasks', JSON.stringify(tasks));
}

function addTask(e) {
  if (input.value === '') {
    alert('Add a task');
  }

  // Create Li Element
  const li = document.createElement('li');
  // Add Class
  li.className = 'beej-todo-list__list-item';
  // Create text node
  li.appendChild(document.createTextNode(input.value));
  // Create new link
  const link = document.createElement('a');
  // Add class to link
  link.className = 'beej-todo-list__list-item-delete';
  // Add icon
  link.innerHTML = '<i class="fa fa-times"></i>';
  // Append link to li
  li.appendChild(link);
  // Append li to ul
  todoList.appendChild(li);

  addTaskLS(input.value);

  input.value = '';

  e.preventDefault();
}

function removeTaskLS(taskItem) {
  let tasks;

  if (localStorage.getItem('tasks') === null) {
    tasks = [];
  } else {
    tasks = JSON.parse(localStorage.getItem('tasks'));
  }

  tasks.forEach((task, index) => {
    if (taskItem.textContent === task) {
      tasks.splice(index, 1);
    }
  });

  localStorage.setItem('tasks', JSON.stringify(tasks));
}

function removeTask(e) {
  if (e.target.parentElement.classList.contains('beej-todo-list__list-item-delete')) {
    e.target.parentElement.parentElement.remove();
    removeTaskLS(e.target.parentElement.parentElement);
  }

  e.preventDefault();
}

function clearTasks() {
  while (todoList.firstChild) {
    todoList.removeChild(todoList.firstChild);
  }
  localStorage.clear();
}

function filterTasks(e) {
  const text = e.target.value.toLowerCase();
  

  document.querySelectorAll('.beej-todo-list__list-item').forEach((task) => {
    const item = task.firstChild.textContent;
    const taskI = task;

    if (item.toLowerCase().indexOf(text) !== -1) {
      taskI.style.display = 'flex';
    } else {
      taskI.style.display = 'none';
    }
  });

  // const list = document.querySelector('.beej-todo-list__list');
  // const noResults = document.querySelector('.no-results');

  // if (list.children(':visible').length === 0) {
  //   noResults.style.display = "block";
  // } else {
  //   noResults.style.display = "none";
  // }
}

function loadEventListeners() {
  // Dom load event
  document.addEventListener('DOMContentLoaded', getTasks);
  // Add Task
  form.addEventListener('submit', addTask);
  // Remove Task
  todoList.addEventListener('click', removeTask);
  // Clear Tasks
  clearTasksButton.addEventListener('click', clearTasks);
  // Filter
  filter.addEventListener('keyup', filterTasks);
}

// Load all event lsteners
loadEventListeners();
