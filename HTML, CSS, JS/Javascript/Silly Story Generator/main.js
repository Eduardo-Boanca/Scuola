const customName = document.getElementById('customname');
const randomize = document.querySelector('.randomize');
const story = document.querySelector('.story');

//Funzione che serve per prendere un valore casuale dall'array
function randomArrayValue(array){
  const random = Math.floor(Math.random()*array.length);
  return array[random];
}

//La storia base
let storyText = 'It was 94 fahrenheit outside, so :insertx: went for a walk. When they got to :inserty:, they stared in horror for a few moments, then :insertz:. Bob saw the whole thing, but was not surprised — :insertx: weighs 300 pounds, and it was a hot day.';
//Alcuni nomi che verranno presi in modo casuale
let insertX = ['Gianni','Checco','Franco'];
//Alcuni posti che verranno presi in modo casuale
let insertY = ['the studio','the White House','the restaurant'];
//Alcune situazioni che verranno presi in modo casuale
let insertZ = ['spontaneously combusted','melted into a puddle on the sidewalk','turned into a slug and crawled away'];

/* Aggiungo un event Listener sul tasto che esegue il randomize, 
che ascolta se viene 'cliccato'
e fa partire la funzione finalStory */
randomize.addEventListener('click', finalStory);

function finalStory() {
  let newStory = storyText;

  /* Valori casuali degli array tramite funzione randomArrayValue */
  let xItem = randomArrayValue(insertX);
  let yItem = randomArrayValue(insertY);
  let zItem = randomArrayValue(insertZ);

  /*
  con il REPLACE vado a sostituire una certa parte della frase
  con i valori casuali contenuti dentro xItem, yItem, zItem
  */
  newStory = newStory.replace(':insertx:',xItem);
  newStory = newStory.replace(':insertx:',xItem);
  newStory = newStory.replace(':inserty:',yItem);
  newStory = newStory.replace(':insertz:',zItem);

  if(customName.value !== '') {
    const name = customName.value;
    newStory = newStory.replace('Bob',name);
  }

  if(document.getElementById("uk").checked) {
    const weight = Math.round(300*0.0714286) + ' stone';
    const temperature =  Math.round((94-32) * 5 / 9) + ' centigrade';
    newStory = newStory.replace('94 fahrenheit',temperature);
    newStory = newStory.replace('300 pounds',weight);
  }

  story.textContent = newStory;
  story.style.visibility = 'visible';
}