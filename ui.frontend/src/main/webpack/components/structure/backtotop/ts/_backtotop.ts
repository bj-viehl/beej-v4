class BackToTop {

  constructor() {
    this.init();
  }

  private init() {
    const scrollTopButton = document.querySelector('.beej-back-to-top-button') as HTMLElement;

    scrollTopButton.addEventListener('click', this.scrollTop);
    document.addEventListener("scroll", this.handleScroll);
  }

  handleScroll = () => {
    const scrollTopButton = document.querySelector('.beej-back-to-top-button') as HTMLElement;
    const footer = document.querySelector('.beej-footer') as HTMLElement;
    let footerPosition = footer.getBoundingClientRect() as DOMRect;

    if (footerPosition.top < window.innerHeight && footerPosition.bottom >= 0) {
      scrollTopButton.style.display = "block";
    } else {
      scrollTopButton.style.display = "none";
    }
  }

  scrollTop = () => {
    window.scrollTo({
      top: 0,
      behavior: 'smooth'
    });
  }
}

const backToTop = new BackToTop();
