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

var contNumeri = [];
while (contNumeri.length < 3) {
    const random = Math.floor(Math.random() * 8);
    if (contNumeri.indexOf(random) === -1)
        contNumeri.push(random);
}

codice.innerHTML = contNumeri.join('');


function rwxCode(code, answer) {
    //const cod = cod_.split('');
    let codice = '';

    for (i = 0; i < 3; i++) {
        let = tmp_code = '';
        for (j = 2; j != -1; j--) {
            if (code[i] >= Math.pow(2, j)) {
                switch (j) {
                    case 0:
                        tmp_code += 'x';
                        break;

                    case 1:
                        tmp_code += 'w';
                        break;

                    case 2:
                        tmp_code += 'r';
                        break;
                }

                code[i] -= Math.pow(2, j);
            }
            else
                tmp_code += '-';
        }

        codice += tmp_code;
    }
    return answer == codice;
}

function verify_code() {

    if (rwxCode(contNumeri, risp.value) == true) {
        risp.style.color = "green";
        correct.style.display = "inline";
    }
    else {
        highlight();
        err.style.display = "inline";
    }
}

function highlight() {
    var orig = risp.style.color;
    risp.style.color = '#f00';
    setTimeout(function () {
        risp.style.color = orig;
    }, 3000);
}

btn.addEventListener('click', verify_code);




