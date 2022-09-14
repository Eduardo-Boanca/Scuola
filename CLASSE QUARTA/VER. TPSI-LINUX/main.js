const input = document.getElementById("input");
const checkbox = document.getElementsByClassName("check");
const input1 = document.getElementById("input1");
const risp = document.getElementById("risposta")

function reset() {
    risp.innerHTML = "";
    input.value = ""
    let i = 0;
        for (i = 0; i < checkbox.length; i++) {
            if (Math.round(Math.random() * 2) == 1)
                checkbox[i].checked = true;
            else
                checkbox[i].checked = false;
        }
}

function controllo() {
    let input = document.getElementById("input");
    let checkbox = document.getElementsByClassName("check");
    let result = 0;
    let i = 0;
    for (i = 0; i < checkbox.length; i++) {
        if (checkbox[i].checked)
            result += Math.pow(2, checkbox.length - i - 1)
    }
    if (result == input.value) {
        risp.innerHTML = "giusto";
    }
    else {
        risp.innerHTML = "sbagliato";
    }
}