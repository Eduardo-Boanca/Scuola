function controllo(src) {
    if (src.value == 1)
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
  
  function controllo2(src) {
    if (src.value == 1)
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