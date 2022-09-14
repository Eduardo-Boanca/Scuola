let season = '';
let response;

// Add your code here
if (season === 'summer') {
    response = "E' una bella giornata, sei in vacanza, e ti stai divertendo"
} else if (season === 'winter') {
    response = "Fa freddo, sta nevicando, e sei in casa al caldo"
} else {
    response = "Non so che stagione sia"
}
// Don't edit the code below here!

const section = document.querySelector('section');

let para1 = document.createElement('p');
para1.textContent = response;
section.appendChild(para1);