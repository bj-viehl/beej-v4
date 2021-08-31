class TodoListAudit {
  constructor() {
    this.init();
  }

  init = () => {
    document.addEventListener('DOMContentLoaded', this.getNotices);
    window.addEventListener('storage', this.showNotices)
  }

  getNotices = () => {
    let notices;
  
    if (localStorage.getItem('notices') === null) {
      notices = [];
    } else {
      notices = [JSON.parse(localStorage.getItem('notices'))];
    }

    const output: HTMLElement = document.querySelector('#list-output');

    notices.forEach((notice) => {
      const noticeItem: HTMLElement = document.createElement('li');

      noticeItem.className = 'beej-todo-list-audit__list-item animate__animated animate__fadeInUp ';
      noticeItem.appendChild(document.createTextNode(notice));

      output.appendChild(noticeItem);
    });

    console.log('on page load');
  }

  showNotices = (e) => {

    console.log('on click');
  }
}

const todoListAudit = new TodoListAudit();