let quote = 'I dO nOT lIke gREen eGgS anD HAM';

// Add your code here
let lower = quote.toLowerCase();
let fixedQuote = quote.charAt(0).toUpperCase() + lower.slice(1);
let finalQuote = fixedQuote.replace("green eggs and ham", "broccoli");;
// Don't edit the code below here!

const section = document.querySelector('section');
section.innerHTML = ' ';
let para1 = document.createElement('p');
para1.textContent = fixedQuote;
let para2 = document.createElement('p');
para2.textContent = finalQuote;

section.appendChild(para1);
section.appendChild(para2);