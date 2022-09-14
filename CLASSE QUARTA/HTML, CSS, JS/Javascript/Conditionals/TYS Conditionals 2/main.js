let response;
let score = 100;
let machineActive = true;

// Add your code here
if (machineActive) {
    if (score < 0 || score > 100) {
        response = "Non è possibile, c'è stato qualche errore";
    } else if (score >= 0 && score < 20) {
        response = "Questo punteggio non è per nulla buono, hai fallito";
    } else if (score >= 20 && score < 40) {
        response = "Sai qualcosa, ma non è un buon punteggio";
    } else if (score >= 40 && score < 70) {
        response = "Hai fatto un lavoro abbastanza buono, non male!";
    } else if (score >= 70 && score < 90) {
        response = "Questo è un buonissimo punteggio, sai davvero il fatto tuo";
    } else if (score >= 90 && score <= 100) {
        response = "Punteggio FANTASTICO! Hai copiato?";
    }
} else {
    response = "Devi accendere la macchina";
}
// Don't edit the code below here!

const section = document.querySelector('section');

let para1 = document.createElement('p');
let para2 = document.createElement('p');

para1.textContent = `Il tuo punteggio è ${score}`;
para2.textContent = response;

section.appendChild(para1);
section.appendChild(para2);