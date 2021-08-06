const form = document.querySelector('#todo-form');
const todoList = document.querySelector('#todo-list');
const clearTasksButton = document.querySelector('.todo-clear');
const filter = document.querySelector('#filter');
const input = document.querySelector('#todo-input');

// Load all event lsteners
loadEventListeners();

function loadEventListeners() {
  // Dom load event
  document.addEventListener('DOMContentLoaded', getTasks);
  //Add Task
  form.addEventListener('submit', addTask);
  //Remove Task
  todoList.addEventListener('click', removeTask);
  // Clear Tasks
  clearTasksButton.addEventListener('click', clearTasks);
  // Filter
  filter.addEventListener('keyup', filterTasks);
  
}

function getTasks() {
  let tasks;

  if (localStorage.getItem('tasks') === null) {
    tasks = [];
  } else {
    tasks = JSON.parse(localStorage.getItem('tasks'));
  }

  tasks.forEach(function(todo) {
    // Create Li Element
    const li = document.createElement('li')
    // Add Class
    li.className = 'beej-todo-list__list-item';
    // Create text node
    li.appendChild(document.createTextNode(todo));
    // Create new link
    const link = document.createElement('a');
    // Add class to link
    link.className = 'beej-todo-list__list-item-delete';
    //Add icon
    link.innerHTML = '<i class="fa fa-remove"></i>';
    // Append link to li
    li.appendChild(link);
    // Append li to ul
    todoList.appendChild(li);
  });
}

function addTask(e) {
  if (input.value === '') {
    alert('Add a task');
  }

  // Create Li Element
  const li = document.createElement('li')
  // Add Class
  li.className = 'beej-todo-list__list-item';
  // Create text node
  li.appendChild(document.createTextNode(todo));
  // Create new link
  const link = document.createElement('a');
  // Add class to link
  link.className = 'beej-todo-list__list-item-delete';
  //Add icon
  link.innerHTML = '<i class="fa fa-remove"></i>';
  // Append link to li
  li.appendChild(link);
  // Append li to ul
  todoList.appendChild(li);


  addTaskLS(input.value);

  input.value = '';

  e.preventDefault();
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

function removeTask(e) {
  if (e.target.parentElement.classList.contains('beej-todo-list__list-item-delete')) {
    e.target.parentElement.parentElement.remove();
  
    removeTaskLS(e.target.parentElement.parentElement);
  }

  e.preventDefault();
}

function removeTaskLS(taskItem) {
  let tasks;

  if (localStorage.getItem('tasks') === null) {
    tasks = [];
  } else {
    tasks = JSON.parse(localStorage.getItem('tasks'));
  }

  tasks.forEach(function(task, index) {
    if (taskItem.textContent === task) {
      tasks.splice(index, 1);
    }
  });

  localStorage.setItem('tasks', JSON.stringify(tasks));
 }

function clearTasks() {
  if (confirm('Are you sure you want to clear your list?')) {
    while(taskList.firstChild) {
      taskList.removeChild(taskList.firstChild);
    }
    localStorage.clear();
  }
}

function filterTasks(e) {
  const text = e.target.value.toLowerCase();

  document.querySelectorAll('.beej-todo-list__list-item').forEach(function(task) {
    const item = task.firstChild.textContent;
    
    if(item.toLowerCase().indexOf(text) != -1) {
      task.style.display = 'block';
    } else {
      task.style.display = 'none';
    }
  });
}