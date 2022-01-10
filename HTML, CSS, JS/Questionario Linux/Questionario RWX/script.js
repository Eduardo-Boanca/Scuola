const risp = document.querySelector('#Risposta');
const codice = document.querySelector('#code');
const correct = document.querySelector('#Corretto');
const reset = document.querySelector('#Resetta');
const container = document.querySelector('#container')
const input = document.querySelector('#input_div')

correct.style.display = "none"

let contenitore = [];
while (contenitore.length < 3) {
    const random = Math.floor(Math.random() * 8);
    if (contenitore.indexOf(random) === -1)
        contenitore.push(random);
}

codice.innerHTML = contenitore.join('');


function rwxCode(code, ans) {
    let tmpCodice = '';
    let codice = '';

    for (i = 0; i < 3; i++) {
        tmpCodice = '';
        for (j = 2; j != -1; j--) {
            if (code[i] >= Math.pow(2, j)) {
                switch (j) {
                    case 0:
                        tmpCodice += 'x';
                        break;

                    case 1:
                        tmpCodice += 'w';
                        break;

                    case 2:
                        tmpCodice += 'r';
                        break;
                }

                code[i] -= Math.pow(2, j);
            }
            else
                tmpCodice += '-';
        }

        codice += tmpCodice;
    }
    return ans == codice;
}

function VerificaRisposta() {
    if (rwxCode(arr, risp.value) == true) {
        risp.style.color = "green";
        correct.style.display = "inline-block"
    }
    else {
        highlight();
    }
}

function highlight() {
    var orig = risp.style.color;
    risp.style.color = '#f00';
    setTimeout(function () {
        risp.style.color = orig;
    }, 3000);
}


