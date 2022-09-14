const names = ['Chris', 'Li Kang', 'Anne', 'Francesca', 'Mustafa', 'Tina', 'Bert', 'Jada']
const para = document.createElement('p');

// Add your code here
function random(min, max) {
    const number = Math.floor(Math.random() * (max - min) + min);
    return number;
}

function nomeCasuale(array) {
    scelta = array[random(0, array.length)];
    return scelta;
}

para.textContent = nomeCasuale(names);
// Don't edit the code below here!

const section = document.querySelector('section');

section.appendChild(para);