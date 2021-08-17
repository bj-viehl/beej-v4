// import {
//   seeDocumentReady
// } from '@dependencies/documentReady';
// import { deviceCheck } from '@dependencies/deviceCheck';

class TodoList {

  constructor() {
    this.init()
  }

  private init = () => {
    // Dom load event
    document.addEventListener('DOMContentLoaded', this.getTasks);
    // Add Task
    document.querySelector('#todo-form').addEventListener('submit', this.addTask);
    // Remove Task
    document.querySelector('#todo-list').addEventListener('click', this.removeTask);
    // Clear Tasks
    document.querySelector('.todo-clear').addEventListener('click', this.clearTasks);
    // Filter
    document.querySelector('#filter').addEventListener('keyup', this.filterTasks);
  }
  
  buildTaskList(task) {
    const list: HTMLElement = document.querySelector('#todo-list');

    // Create Li Element
    const li: HTMLElement = document.createElement('li');
    // Create new link
    const link: HTMLElement = document.createElement('a');

    // Add Class
    li.className = 'beej-todo-list__list-item';
    // Create text node
    li.appendChild(document.createTextNode(task));
    // Add class to link
    link.className = 'beej-todo-list__list-item-delete';
    // Add icon
    link.innerHTML = '<i class="fa fa-times"></i>';

    // Append link to li
    li.appendChild(link);
    // Append li to ul
    list.appendChild(li);
  }

  addTask(e) {
    const input: HTMLInputElement = document.querySelector('#todo-input');

    if (input.value === '') {
      alert('Add a task');
    } else {
      this.buildTaskList(input.value);
      this.addTaskLS(input.value);
    }

    input.value = '';
  
    e.preventDefault();
  }

  removeTask(e) {
    if (e.target.parentElement.classList.contains('beej-todo-list__list-item-delete')) {
      e.target.parentElement.parentElement.remove();
      this.removeTaskLS(e.target.parentElement.parentElement);
    }
  
    e.preventDefault();
  }

  filterTasks(e) {
    const text = e.target.value.toLowerCase();
  
    document.querySelectorAll('.beej-todo-list__list-item').forEach((task) => {
      let item = task.firstChild.textContent as String;
      let taskI = task as HTMLElement;
  
      if (item.toLowerCase().indexOf(text) !== -1) {
        taskI.style.display = 'flex';
      } else {
        taskI.style.display = 'none';
      }
    });
  }

  clearTasks(list) {
    while (list.firstChild) {
      list.removeChild(list.firstChild);
    }
    localStorage.clear();
  }
  
  getTasks() {
    let tasks;
  
    if (localStorage.getItem('tasks') === null) {
      tasks = [];
    } else {
      tasks = JSON.parse(localStorage.getItem('tasks'));
    }

    return tasks;
  }

  displayTasks() {
    const tasks = this.getTasks();

    tasks.forEach((task) => {
      this.buildTaskList(task);
    });
  }

  addTaskLS(task) {
    let tasks;
  
    if (localStorage.getItem('tasks') === null) {
      tasks = [];
    } else {
      tasks = JSON.parse(localStorage.getItem('tasks'));
    }
  
    tasks.push(task);
  
    localStorage.setItem('tasks', JSON.stringify(tasks));
  }

  removeTaskLS(taskItem) {
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
}

export const todoList = new TodoList();
