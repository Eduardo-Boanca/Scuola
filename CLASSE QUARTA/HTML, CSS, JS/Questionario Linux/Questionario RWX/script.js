const risp = document.getElementById('risposta');
const codice = document.querySelector('#code');
const correct = document.getElementById('correct');
const reset = document.getElementById('Resetta');
const container = document.getElementById('container');
const input = document.getElementById('input_div');
const btn = document.getElementById('verify');
const err = document.getElementById('error');

correct.style.display = "none"
err.style.display = "none"

//in un array che verrà ciclato per 3 volte, genero numeri da 0 a 7
var contNumeri = [];
while (contNumeri.length < 3) {
    const random = Math.floor(Math.random() * 8);
    //Se dentro l'array non c'è l'elemento 'random' (la cifra), questo elementro viene messo alla fine del'array
    if (contNumeri.indexOf(random) === -1)
        contNumeri.push(random);
}
codice.innerHTML = contNumeri.join('');



//in questa funzione vado ad assegnare a ogni cifra del codice un valore r/w/x/-
function rwxCode(code, answer) {
    let codice = '';
    for (i = 0; i < 3; i++) {

        let = tmp_code = '';

        for (k = 2; k != -1; k--) {

            //assegno alla cifra il permesso corrispondente tramite le potenze di due
            if (code[i] >= Math.pow(2, k)) {

                switch (k) {
                    //se coindice con il case 0; significa che la cifra equivale a 1
                    case 0:
                        tmp_code += 'x';
                        break;

                    //se coindice con il case 1; significa che la cifra equivale a 2
                    case 1:
                        tmp_code += 'w';
                        break;

                    //se coindice con il case 2; significa che la cifra equivale a 4
                    case 2:
                        tmp_code += 'r';
                        break;
                }
                //sottraggo all'array in posizione i, la potenza di k elevato a 2
                code[i] -= Math.pow(2, k);
            }
            else
                //altrimenti equivale a 0 e quindi il trattino
                tmp_code += '-';
        }

        codice += tmp_code;
    }
    return answer == codice;
}

function verify_code() {

    if (rwxCode(contNumeri, risp.value) === true) {
        risp.style.color = "green";
        correct.style.display = "inline";
    }
    else {
        error_msg();
        //CODICE PER CREARE NUOVO INPUT !NON FUNZIONANTE!
        // let input = document.createElement("input");
        // input.setAttribute('type', 'text');
        // var parent = document.getElementById('input_div');
        // parent.appendChild(input);
    }
}

//Funzione che dopo rende la risposta di colore rosso per tre secondi, e dopo 3 secondi cancella l'input inserito dall'utente
function error_msg() {
    var orig = risp.style.color;
    risp.style.color = '#f00';
    err.style.display = "inline";
    setTimeout(function () {
        risp.style.color = orig;
        risp.value = '';
        err.style.display = "none";
    }, 3000);
}


btn.addEventListener('click', verify_code);




