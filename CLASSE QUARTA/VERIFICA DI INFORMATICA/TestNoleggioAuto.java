public class TestNoleggioAuto {
    public static void main(String[] args) {
        Orario ora1 = new Orario(15, 30);
        Orario ora2 = new Orario(17, 40);
        Orario ora3 = new Orario(ora1);

        NoleggioAuto auto1 = new NoleggioAuto("AK645WQ", 12.00, 10, 30, 17, 30);
        NoleggioAuto auto2 = new NoleggioAuto("GD231PQ", 12.00, 11, 45, 15, 30);

        ora1.orarioToString();

        if(auto1.compareToPrezzo(auto2) == 0)
        {
            System.out.println("Le due auto hanno pagato lo stesso prezzo");
        }

        if(auto1.compareToPrezzo(auto2) == 1)
        {
            System.out.println("Auto1 ha pagato di piu di Auto2");
        }

        if(auto1.compareToPrezzo(auto2) == -1)
        {
            System.out.println("Auto1 ha pagato meno di Auto2");
        }



        if(auto1.compareToDurata(auto2) == 0)
        {
            System.out.println("Le due auto hanno noleggiato per lo stesso periodo");
        }

        if(auto1.compareToDurata(auto2) == 1)
        {
            System.out.println("Auto1 ha noleggiato per più tempo di Auto2");
        }

        if(auto1.compareToDurata(auto2) == -1)
        {
            System.out.println("Auto1 ha noleggiato per meno tempo di Auto2");
        }


        if(auto1.equals(auto2) == true)
        {
            System.out.println("Hanno noleggiato per la stessa durata di tempo");
        }
        else
        {
            System.out.println("Hanno noleggiato per una durata di tempo diversa");
        }

        auto1.prezzoTotale();
        auto1.durataNoleggio();
        auto2.durataNoleggio();
    }
}
