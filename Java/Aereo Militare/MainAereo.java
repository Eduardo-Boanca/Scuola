public class MainAereo {
    public static void main(String[] args) {
        
        Aereo a1 = new Aereo("Boeing 737", "Boeing", 2020);
        Aereo a6 = new Aereo(a1);
        AereoDiLinea a2 = new AereoDiLinea("Boeing 737", "Boeing", 2020, "Emirates", 237);
        AereoDiLinea a5 = new AereoDiLinea(a2); //costruttore di copia
        AereoMilitare a3 = new AereoMilitare("F-22", "Lockheed Martin-Boeing", 2005, 2469.6, 11.500); //VELOCITA: 2469.6 = MACH 2   PESO 11 MILA 500
        AereoMilitare a4 = new AereoMilitare(a3); //costruttore di copia

        System.out.println("\n");
        a1.presentati();
        System.out.println("\n");
        a6.presentati();
        System.out.println("\n");
        a2.presentati();
        System.out.println("\n");
        a3.presentati();
        System.out.println("\n");
        a4.presentati();
        System.out.println("\n");
        a5.presentati();
        System.out.println("\n");

        if(a3.equals(a4))
        {
            System.out.println("\n");
            System.out.println("I due aerei sono uguali");
            System.out.println("\n");
        }
        else {
            System.out.println("\n");
            System.out.println("Non sono uguali");
            System.out.println("\n");
        }


        System.out.println(a2.emergenza());
        System.out.println("\n");
        System.out.println(a3.emergenza());
        System.out.println("\n");
    }
}
