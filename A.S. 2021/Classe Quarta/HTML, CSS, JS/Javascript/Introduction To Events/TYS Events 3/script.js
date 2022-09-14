const buttonBar = document.querySelector('.button-bar');

//Add your code here
buttonBar.addEventListener('click', e => {
  const btn = e.target;
  buttonBar.style.backgroundColor = btn.dataset.color;
});
// function setColor(e) {
//   buttonBar.style.backgroundColor = e.target.getAttribute('data-color');
// }

// buttonBar.addEventListener('click', setColor);