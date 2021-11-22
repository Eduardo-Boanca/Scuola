let question1 = documentGetElementById('q1');
let question2 = documentGetElementById('q2');
let question3 = documentGetElementById('q3');
let BtnEle = document.querySelector(".Btn");
let resEle = document.querySelector(".risposta");

BtnEle.onclick = isChecked();

function isChecked() {

    if (question1.checked == true) {
        resEle.innerHTML = "Risposta Corretta!";
    }

    if (question2.checked == true || question3.checked == true) {
        resEle.innerHTML = "Risposta Sbagliata!";
    }
}



