public class MainAereo {
    public static void main(String[] args) {
        
        Aereo a1 = new Aereo("Boeing 737", "Boeing", 2020);
        AereoDiLinea a2 = new AereoDiLinea("Boeing 737", "Boeing", 2020, "Emirates", 237);
        AereoMilitare a3 = new AereoMilitare("F-22", "Lockheed Martin-Boeing", 2005, 2469.6, 11.500); //VELOCITA: 2469.6 = MACH 2   PESO 11 MILA 500

        System.out.println("\n");
        a1.presentati();
        System.out.println("\n");
        a2.presentati();
        System.out.println("\n");
        a3.presentati();
        System.out.println("\n");

        a2.emergenza();
        System.out.println("\n");
        a3.emergenza();
        System.out.println("\n");
    }
}
