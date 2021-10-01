public class Main {
    
    public static void main(String[] args)
    {
        Automobile auto = new Automobile("DG512WF","BMW", 5000, 0, 0);

        auto.presentati();
        auto.accendi();
        auto.acceleration(150);
        auto.acceleration(50);
        auto.presentati();
        auto.spegni();
        auto.presentati();
    }
}
