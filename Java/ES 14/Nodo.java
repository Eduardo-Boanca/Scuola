public class Nodo
{
    private Persona persona;
    private Nodo successivo;

    /**
     * Costruttore Nodo
     */
    public Nodo()
    {
        this.persona = new Persona();
        this.successivo = null;
    }

    /**
     * @paramCostruttore Nodo
     */
    public Nodo(String dato, Nodo successivo)
    {
        this.persona = new Persona();
        this.successivo = successivo;
    }

    
    /** 
     * @param succ indica il successivo
     */
    public void setSuccessivo(Nodo succ)
    {
        this.successivo = succ;
    }

    
    /** 
     * @return Nodo ritorna il nodo
     */
    public Nodo getSuccessivo()
    {
        return this.successivo;
    }

    
    /** 
     * @return Persona ritorna la persona
     */
    public Persona getPersona()
    {
        return this.persona;
    }
}