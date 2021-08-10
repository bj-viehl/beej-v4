// export class TodoList {
//   let form = document.querySelector('#todo-form') as HTMLFormElement;
//   let list = document.querySelector('#todo-list') as HTMLElement;
//   let clearButton = document.querySelector('.todo-clear') as HTMLElement;
//   let filter = document.querySelector('#filter') as HTMLElement;
//   let input = document.querySelector('#todo-input') as HTMLInputElement;
  
//   function getTasks() {
//     let tasks;
  
//     if (localStorage.getItem('tasks') === null) {
//       tasks = [];
//     } else {
//       tasks = JSON.parse(localStorage.getItem('tasks'));
//     }
  
//     tasks.forEach((task) => {
//       // Create Li Element
//       const li = document.createElement('li') as HTMLElement;
//       // Add Class
//       li.className = 'beej-todo-list__list-item';
//       // Create text node
//       li.appendChild(document.createTextNode(task));
//       // Create new link
//       const link = document.createElement('a') as HTMLElement;
//       // Add class to link
//       link.className = 'beej-todo-list__list-item-delete';
//       // Add icon
//       link.innerHTML = '<i class="fa fa-times"></i>';
//       // Append link to li
//       li.appendChild(link);
//       // Append li to ul
//       list.appendChild(li);
//     });
//   }
  
//   function addTaskLS(task) {
//     let tasks;
  
//     if (localStorage.getItem('tasks') === null) {
//       tasks = [];
//     } else {
//       tasks = JSON.parse(localStorage.getItem('tasks'));
//     }
  
//     tasks.push(task);
  
//     localStorage.setItem('tasks', JSON.stringify(tasks));
//   }
  
//   function addTask(e) {
//     if (input.value === '') {
//       alert('Add a task');
//     }
  
//     // Create Li Element
//     const li = document.createElement('li') as HTMLElement;
//     // Add Class
//     li.className = 'beej-todo-list__list-item';
//     // Create text node
//     li.appendChild(document.createTextNode(input.value));
//     // Create new link
//     const link = document.createElement('a') as HTMLElement;
//     // Add class to link
//     link.className = 'beej-todo-list__list-item-delete';
//     // Add icon
//     link.innerHTML = '<i class="fa fa-times"></i>';
//     // Append link to li
//     li.appendChild(link);
//     // Append li to ul
//     list.appendChild(li);
  
//     addTaskLS(input.value);
  
//     input.value = '';
  
//     e.preventDefault();
//   }
  
//   function removeTaskLS(taskItem) {
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
  
//   function removeTask(e) {
//     if (e.target.parentElement.classList.contains('beej-todo-list__list-item-delete')) {
//       e.target.parentElement.parentElement.remove();
//       removeTaskLS(e.target.parentElement.parentElement);
//     }
  
//     e.preventDefault();
//   }
  
//   function clearTasks() {
//     while (list.firstChild) {
//       list.removeChild(list.firstChild);
//     }
//     localStorage.clear();
//   }
  
//   function filterTasks(e) {
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

//   function loadEventListeners() {
//     // Dom load event
//     document.addEventListener('DOMContentLoaded', getTasks);
//     // Add Task
//     form.addEventListener('submit', addTask);
//     // Remove Task
//     list.addEventListener('click', removeTask);
//     // Clear Tasks
//     clearButton.addEventListener('click', clearTasks);
//     // Filter
//     filter.addEventListener('keyup', filterTasks);
//   }

//   loadEventListeners();
// }

// export const todoList = new TodoList();
