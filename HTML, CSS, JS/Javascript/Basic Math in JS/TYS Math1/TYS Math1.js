let finalResult;

let evenOddResult;

let num1 = 9;
let num2 = 7;
let num3 = 20;
let num4 = 23;

let sum = (num1 + num2);
let diff = (num4 - num3);

finalResult = (sum * diff);

const section = document.querySelector('section');

let para1 = document.createElement('p');
let finalResultCheck = finalResult === 48 ? `Yes, well done!` : `No, it is ${ finalResult }`;
para1.textContent = `Is the finalResult 48? ${ finalResultCheck }`;
let para2 = document.createElement('p');
let evenOddResultCheck = evenOddResult === 0 ? 'The final result is even!' : 'The final result is odd. Hrm.'
para2.textContent = evenOddResultCheck;

section.appendChild(para1);
section.appendChild(para2);