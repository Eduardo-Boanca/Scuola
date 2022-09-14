document.getElementById("guess").style.display = "hidden";

function checkGuess() {
   let risposta = document.getElementById('submit');
   
   if((risposta.value == "") || (risposta.value == undefined))
      document.getElementById('guess') = innerHTML = '';
   
   if (risposta.value == "ls" || risposta.value == "LS" || risposta.value == "Ls") 
   {
      document.getElementById('guess').innerHTML= 'La risposta è giusta';
      guess.style.backgroundColor = 'green';
      document.getElementById('guess').style.display = "inline";
   }
   else
   {
      document.getElementById('guess').innerHTML= 'La risposta è sbagliata, Riprova';
      guess.style.backgroundColor = 'red';
      document.getElementById('guess').style.display = "inline";
   }    
}

checkGuess(); 