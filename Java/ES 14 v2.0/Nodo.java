
// Class Nodo
class Nodo
{
	private Persona dato;
	private Nodo successivo;

// costruttore
public Nodo(Persona dato)
 {
	  this.dato = dato;
	  successivo = null;
 }


 public void setSuccessivo(Nodo succ)
  {
 	  successivo = succ;
  }

 public Nodo getSuccessivo()
  {
 	  return successivo;
  }

 public Persona getDato()
  {
   	  return dato;
  }
} //Nodo