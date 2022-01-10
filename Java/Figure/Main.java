class Main
{
    public static void main(String[] args) 
    {
        System.out.println("hbkbib");
        Rettangolo rettangolo = new Rettangolo(5,15,5,10);
        Sfera sfera1 = new Sfera(5,3,3,5);
        Punto3D punto3d = new Punto3D(5,3,3);
        Quadrato quadrato = new Quadrato(15,15,10);
        Cerchio cerchio = new Cerchio(10,25,10);
        Cerchio cerchio2 = new Cerchio(10,25,8);
        Punto punto = new Punto(5, 10);
        Linea linea = new Linea(10, 10, 16, 16);
        // punto.disegna();
         linea.presentati();
        // if(cerchio.equals(cerchio2))
        //     System.out.println("I due cerchi sono uguali");
        // else
        //     System.out.println("Non sono uguali");
    }
}