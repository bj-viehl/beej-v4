class Header {
  private static readonly HEADER = '.beej-header';
  private static readonly HEADER_MENU = '.beej-header__menu';
  private static readonly MENU_BUTTON = '.beej-header__menu-button';
  private static readonly MENU_ICON = '.beej-header__menu-button-icon--menu';
  private static readonly CLOSE_ICON = '.beej-header__menu-button-icon--close';
  private static readonly BEEJ_MAIN = '.beej-main';

  private header: HTMLElement;

  constructor() {
    this.init();
  }

  init = () => {
    this.header = document.querySelector(Header.HEADER) as HTMLElement;
    const button = document.querySelector(Header.MENU_BUTTON) as HTMLElement;
    const main = document.querySelector(Header.BEEJ_MAIN) as HTMLElement;
    const sticky = this.header.dataset.sticky;

    if (button) {
      button.addEventListener("click", this.toggleMenu);
    }

    if (sticky == 'true') {
      main.style.marginTop = 80 + 'px';
    }
  }

  private toggleMenu = () => {
    const menu = this.header.querySelector(Header.HEADER_MENU) as HTMLElement;
    const menuIcon = this.header.querySelector(Header.MENU_ICON) as HTMLElement;
    const closeIcon = this.header.querySelector(Header.CLOSE_ICON) as HTMLElement;

    if (menu.classList.contains('beej-header__menu--active')) {
        menu.classList.remove('beej-header__menu--active');
        menuIcon.style.display = 'block';
        closeIcon.style.display = 'none';
    } else {
        setTimeout(() => {
            menu.classList.add('beej-header__menu--active');
            menuIcon.style.display = 'none';
            closeIcon.style.display = 'block';
        }, 50);
    }
  }
}

const header = new Header();