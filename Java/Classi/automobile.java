class Automobile {
    //Attributi
    String targa;
    String marca;
    int cavalli;
    int stato; //stato di accesione 0 = spento, 1 = acceso;
    int speed;

    //Costruttore
    //costruttore con una firma che inizia con una stringa
    public Automobile(String mytarga, String mymarca, int mycavalli, int mystato, int myspeed)
    {
        marca = mymarca;
        targa = mytarga;
        cavalli = mycavalli;
        stato = mystato;
        speed = myspeed;
    }

    //un secondo costruttore con una firma diversa (prima un intero e poi una stringa)
    public Automobile(int mycavalli, String mytarga, String mymarca, int mystato, int myspeed)
    {
        marca = mymarca;
        targa = mytarga;
        cavalli = mycavalli;
        stato = mystato;
        speed = myspeed;
    }

    //Metodi
    void accendi()
    {
        stato = 1;
    }

    void spegni()
    {
        stato = 0;
        speed = 0;
    }

    void presentati()
    {
        System.out.println("La mia targa è " + targa);
        System.out.println("La mia marca è " + marca);
        
        if (stato == 0)
            System.out.println("Sono spenta ");
        else
            System.out.println("Sono accesa ");
        
        System.out.println("La mia velocità è " +speed+ "km/h");
    }

    void acceleration(int incremento)
    {
        speed += incremento;
    }
}
