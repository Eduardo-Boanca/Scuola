let machineActive = false;
let pwd = 'chus';

let machineResult;
let pwdResult;

// Add your code here
if (machineActive) {
    machineActive = "La macchina è attiva. Sto provando a fare il Login"
        //  pwd identico a cheese ?     Espressione se vero        :  Espression se falso ---- Ternary Operator, tre condizioni
    pwdResult = pwd === 'cheese' ? 'Login effettuato con successo' : 'La password è sbagliata. Login non effettuato'
} else {
    machineResult = "La macchina non è attiva. Accendila"
}
// Don't edit the code below here!

const section = document.querySelector('section');

let para1 = document.createElement('p');
let para2 = document.createElement('p');

para1.textContent = machineResult;
para2.textContent = pwdResult;

section.appendChild(para1); 
section.appendChild(para2);