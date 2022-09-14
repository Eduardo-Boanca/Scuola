const convert = document.querySelector('.convert');
convert.addEventListener('click', converter())

function converter();
{
    if(document.getElementById("miles"))
    {
      document.getElementById("convert").onclick = myFunction();
    
        function myFunction() {
            var km = document.getElementById("converter").value;
            var miles = km / 1.609;
            miles = miles.toFixed(4);
            document.getElementById("res").innerHTML = ' ' + miles + ' miles'; 
        }

    } else {
      document.getElementById("convert").onclick = myFunction2(); 

      function myFunction2() {
        var miles2 = document.getElementById("converter").value;
        var km2 = miles2 * 1.609;
        km2 = km2.toFixed(4);
        document.getElementById("res").innerHTML = ' ' + km2 + ' km';
      }

     
    }
}