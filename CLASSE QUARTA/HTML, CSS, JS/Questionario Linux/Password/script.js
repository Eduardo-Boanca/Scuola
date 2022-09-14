var randomDate;
const risposta = document.getElementById("risposta")
const random = document.getElementById("random");

function genRandom() {
  randomDate = Math.floor(Math.random() * (20000 - 19000 + 1) + 19000);
  document.getElementById("random").innerHTML = randomDate;
}

function verify() {
  var date1 = new Date(randomDate * 10000000).toLocaleDateString("fr-CA");
  var date2 = document.getElementById("a1").value;
  console.log(date1);
  console.log(date2);

  if (date1 == date2) {
    document.getElementById("risposta").style.color = '#004700';
    document.getElementById("risposta").innerHTML = 'Corretto!';
  } else {
    document.getElementById('risposta').style.color = '#e60000';
    document.getElementById("risposta").innerHTML = 'Errato!';
  }
}

function reset() {
  randomDate = '';
  document.getElementById("random").innerHTML = randomDate;
  document.getElementById("risposta").innerHTML = '';
  document.getElementById("risposta").innerHTML = '';
}