function controllo() {
    var risposta = document.getElementsByName("option");

    for (var i = 0, length = risposta.length; i < length; i++) {
        
        if (risposta[i].checked == "0") 
        {
            document.getElementById("risFinale1").innerHTML = "La risposta è giusta";
            risFinale1.style.backgroundColor = 'green';
        }
            
        else
        {
            document.getElementById("risFinale1").innerHTML = "La risposta è sbagliata";
            risFinale1.style.backgroundColor = 'red';
        }
            
    }
}

function controllo2() {
    var risposta2 = document.getElementsByName("option2");

    for (var i = 0, length = risposta2.length; i < length; i++) {
        
        if (risposta2[i].checked == "0")
        {
            document.getElementById("risFinale2").innerHTML = "La risposta è giusta";
            risFinale2.style.backgroundColor = 'green';
        }
        else
        {
            document.getElementById("risFinale2").innerHTML = "La risposta è sbagliata";
            risFinale2.style.backgroundColor = 'red';
        }
            
    }
}