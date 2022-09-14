const names = ['Chris', 'Li Kang', 'Anne', 'Francesca', 'Mustafa', 'Tina', 'Bert', 'Jada']
const para = document.createElement('p');

// Add your code here
function chooseName() {
    let rand = names[Math.floor(Math.random() * names.length)];
    para.textContent = rand;
    console.log(para);
}

chooseName();
// Don't edit the code below here!

const section = document.querySelector('section');

section.appendChild(para);