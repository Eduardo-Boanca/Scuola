
// Class Lista
class Lista
{
	private Nodo testa = null;
	private Nodo coda = null;

// cop_2uttore vuoto
    public Lista()  {}

public Nodo getTesta()
{
	return this.testa;
}

public Nodo getCoda()
{
	return this.coda;
}

// inserimento di un elemento in lista in ordine alfabetico
	public void inserisci (Persona p_2)
	{
     Nodo n = new Nodo(p_2);
     Nodo temp, succ;
     boolean aggiunto;

//     System.out.println("Entro in inserisci" +p_2);

     if (testa == null)
      {
		  testa = coda = n;
//		  System.out.println("primo inserimento testa = coda");
	  }
	 else
	 {
		 // controlla se va inserito in testa
	  if (p_2.getNome().compareTo(testa.getDato().getNome())<0)
	    {
//		  System.out.println("inserisco in testa");
	      n.setSuccessivo(testa);
	  	  testa = n;
	    }
	   else
	   {
		   // controlla all'interno della lista
//		    System.out.println("inserisco all'interno della lista");

	   	    aggiunto = false;
	   	  	temp =  testa;
	   	  	succ = testa.getSuccessivo();
	   	  	while (succ != null)
	   	  	 {
		      if (p_2.getNome().compareTo(testa.getDato().getNome())<0)
	           {
	             temp.setSuccessivo(n);
	  	         n.setSuccessivo(succ);
	  	         aggiunto = true;
	  	         break;
	            }
	           temp = succ;
	           succ = succ.getSuccessivo();
	         }
	        // controlla se va inserito in coda
			if (!aggiunto)
		     {
//		      System.out.println("inserisco in coda");

			  coda.setSuccessivo(n);
			  coda = n;
	         }
	      }
	    }
//	   System.out.println("Esco da  inserisci");

	   } //end inserisci



// Eliminazione ci un elemento specifico
public void elimina (Persona p_2)
	{
     Nodo temp, succ;
     //boolean aggiunto;

     if (p_2.equals(testa.getDato()))
      {
		  //elimina elemento in testa
		  testa = testa.getSuccessivo();
	  }
	 else
	  {
	   temp = testa;
	   succ = testa.getSuccessivo();
	   while (succ != null)
	    {
	     if (p_2.equals(succ.getDato()))
	      {
	       temp.setSuccessivo(succ.getSuccessivo());
	   	   break;
	      }
	     temp = succ;
	     succ = succ.getSuccessivo();
	    }
   // controlla se e' stata modificata la coda della lista
	if (temp.getSuccessivo() == null)
	  {
	   coda = temp;
	  }
     }
     System.out.println("Il nome inserito è stato eliminato dalla lista");
   } //end elimina


// stampa del contenuto della lista
public void stampa ()
	{
     Nodo temp;

     System.out.println("Contenuto della lista");
     temp = testa;
     while (temp != null)
     {
	   System.out.println(temp.getDato());
	   temp = temp.getSuccessivo();
	 }
    }


// controlla se esiste nella lista un elemento specifico
public boolean contiene(Persona p_2)
	{
     Nodo temp;

     temp = testa;
     while (temp != null)
      {
        System.out.println(temp.getDato());
		if (p_2.equals(temp.getDato()))
	   	  {
           System.out.println("Il nome è stato trovato nella lista");
	   	    return true;
	      }
	     temp = temp.getSuccessivo();
	  }
    System.out.println("Il nome non è stato trovato nella lista");
     return false;
     } // end contiene
}