public class Main
{
    public static void main(String[] args) 
    {
        Punto p = new Punto(2,4);
        p.disegna();
        Punto p2 = new Punto(4,3);
        Punto3D p3D = new Punto3D(3,4,5);
       // Rettangolo rett = new Rettangolo(p.getX(),p.getY(),5,6);

        p.presentati();
        p2.presentati();
        //rett.presentati();
        //rett.muovi(5, 5);
        //rett.presentati();

        
        System.out.println("La distanza tra i due punti e' di: "+p.getDistance(p2));

        p3D.presentati();
        p3D.muovi(5,5,5);
        p3D.presentati();
        //Cerchio c1 = new Cerchio(5,6,3);
        //System.out.println("Area Cerchio: "+c1.getArea());
    }
}