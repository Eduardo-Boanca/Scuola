let response;
let score = 100;
let machineActive = true;

if (machineActive) {
    switch (true) {
        case (score < 0 || score > 100):
            response = "Non è possibile, c'è stato qualche errore";
            break;
        case (score >= 0 && score < 20):
            response = "Questo punteggio non è per nulla buono, hai fallito";
            break;
        case (score >= 20 && score < 40):
            response = "Sai qualcosa, ma non è un buon punteggio";
            break;
        case (score >= 40 && score < 70):
            response = "Hai fatto un lavoro abbastanza buono, non male!";
            break;
        case (score >= 70 && score < 90):
            response = "Questo è un buonissimo punteggio, sai davvero il fatto tuo";
            break;
        case (score >= 90 && score <= 100):
            response = "Punteggio FANTASTICO! Hai copiato?";
    }
} else {
    response = 'The machine is turned off. Turn it on to process your score.';
}

// Don't edit the code below here!

const section = document.querySelector('section');

let para1 = document.createElement('p');
let para2 = document.createElement('p');

para1.textContent = `Your score is ${score}.`;
para2.textContent = response;

section.appendChild(para1);
section.appendChild(para2);