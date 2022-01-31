public class Nodo
{
    private Persona persona;
    private Nodo successivo;

    public Nodo()
    {
        this.persona = new Persona();
        this.successivo = null;
    }

    public Nodo(String dato, Nodo successivo)
    {
        this.persona = new Persona();
        this.successivo = successivo;
    }

    public void setSuccessivo(Nodo succ)
    {
        this.successivo = succ;
    }

    public Nodo getSuccessivo()
    {
        return this.successivo;
    }

    public Persona getPersona()
    {
        return this.persona;
    }
}