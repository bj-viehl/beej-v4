// import {
//   seeDocumentReady
// } from '@dependencies/documentReady';
// import { deviceCheck } from '@dependencies/deviceCheck';

// class TodoList {
//   constructor() {
//     this.init();
//   }

//   init = () => {
//     document.addEventListener('DOMContentLoaded', this.getTasks);
//     document.querySelector('#todo-form').addEventListener('submit', this.addTask);
//     document.querySelector('#todo-list').addEventListener('click', this.removeTask);
//     document.querySelector('.todo-clear').addEventListener('click', this.clearTasks);
//     document.querySelector('#filter').addEventListener('keyup', this.filterTasks);
//   }

//   getTasks() {
//     let tasks;
  
//     if (localStorage.getItem('tasks') === null) {
//       tasks = [];
//     } else {
//       tasks = JSON.parse(localStorage.getItem('tasks'));
//     }

//     const list: HTMLElement = document.querySelector('#todo-list');

//     tasks.forEach((task) => {
//       const li: HTMLElement = document.createElement('li');
//       const link: HTMLElement = document.createElement('a');

//       li.className = 'beej-todo-list__list-item animate__animated animate__bounceInUp ';
//       li.appendChild(document.createTextNode(task));
//       link.className = 'beej-todo-list__list-item-delete';
//       link.innerHTML = '<i class="fa fa-times"></i>';

//       li.appendChild(link);
//       list.appendChild(li);
//     });
//   }

//   addTask = (e) => {
//     const input: HTMLInputElement = document.querySelector('#todo-input');
//     const list: HTMLElement = document.querySelector('#todo-list');

//     if (input.value === '') {
//       alert('Add a task please');
//     } else {
//       const li: HTMLElement = document.createElement('li');
//       const link: HTMLElement = document.createElement('a');

//       li.className = 'beej-todo-list__list-item animate__animated animate__backOutLeft animate__bounceInUp ';
//       li.appendChild(document.createTextNode(input.value));
//       link.className = 'beej-todo-list__list-item-delete';
//       link.innerHTML = '<i class="fa fa-times"></i>';

//       li.appendChild(link);
//       list.appendChild(li);

//       this.addTaskLS(input.value);
//       this.addNoticeSS(input.value);
//     }

//     input.value = '';
  
//     e.preventDefault();
//   }

//   addTaskLS = (task) => {
//     let tasks;
  
//     if (localStorage.getItem('tasks') === null) {
//       tasks = [];
//     } else {
//       tasks = JSON.parse(localStorage.getItem('tasks'));
//     }

//     tasks.push(task);

//     localStorage.setItem('tasks', JSON.stringify(tasks));
//   }

//   addNoticeSS = (task) => {
//     let notices;

//     if (localStorage.getItem('notices') === null || localStorage.getItem('notices') === '') {
//       notices = [];
//     } else {
//       notices = JSON.parse(localStorage.getItem('notices'));
//     }

//     let notice = `User added '${task}' to the todo list`;

//     notices.push(notice);
  
//     localStorage.setItem('notices', JSON.stringify(notices));
//   }

//   removeTask = (e) => {
//     if (e.target.parentElement.classList.contains('beej-todo-list__list-item-delete')) {
//       e.target.parentElement.parentElement.remove();
//       this.removeTaskLS(e.target.parentElement.parentElement);
//     }
  
//     e.preventDefault();
//   }

//   removeTaskLS = (taskItem) => {
//     let tasks;
  
//     if (localStorage.getItem('tasks') === null) {
//       tasks = [];
//     } else {
//       tasks = JSON.parse(localStorage.getItem('tasks'));
//     }
  
//     tasks.forEach((task, index) => {
//       if (taskItem.textContent === task) {
//         tasks.splice(index, 1);
//       }
//     });
  
//     localStorage.setItem('tasks', JSON.stringify(tasks));
//   }

//   filterTasks(e) {
//     const text = e.target.value.toLowerCase();
  
//     document.querySelectorAll('.beej-todo-list__list-item').forEach((task) => {
//       let item = task.firstChild.textContent as String;
//       let taskI = task as HTMLElement;
  
//       if (item.toLowerCase().indexOf(text) !== -1) {
//         taskI.style.display = 'flex';
//       } else {
//         taskI.style.display = 'none';
//       }
//     });
//   }

//   clearTasks = () => {
//     const list: HTMLElement = document.querySelector('#todo-list');

//     while (list.firstChild) {
//       list.removeChild(list.firstChild);
//     }
//     localStorage.clear();
//   }
// }

// const todoList = new TodoList();
