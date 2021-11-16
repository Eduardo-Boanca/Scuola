var bold = document.getElementById('grassetto');
var underline = document.getElementById('sottolineato');
var italic = document.getElementById('corsivo');
var title = document.getElementById('title')

function cambiaTesto() {

    if (bold.checked) {
        title.style.fontWeight = 'bold';
    } else {
        title.style.fontWeight = 'normal';
    }

    if (underline.checked) {
        title.style.textDecoration = 'underline';
    } else {
        title.style.textDecoration = 'none';
    }

    if (italic.checked) {
        title.style.fontStyle = 'italic';
    } else {
        title.style.fontStyle = 'normal';
    }

    }



    function reverseString(){
        var str = document.getElementById('reversTheName').value;
        var newString="";
     
        for(var i=str.length-1; i>=0; i--){
         newString += str[i];
        }
        document.getElementById('showData').value = newString;
       }