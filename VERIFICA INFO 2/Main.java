public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Ciao", "Pippo", 1900, "franco", 7);
        Libro libro2 = new Libro("Ciaone", "Paperino", 1970, "gianni", 8);

        Film film1 = new Film("Ciao", "Pippo", 1900, "franco", 5);
        Film film2 = new Film("Ciaone", "Paperino", 1970, "gianni", 5);

        libro1.presentati();
        film2.presentati();

        if (libro1.isBetterThen(libro2.getRecensione()) == 0)
            System.out.println("\nIl primo libro e il secondo hanno lo stesso voto");
        else if (libro1.isBetterThen(libro2.getRecensione()) > 0)
            System.out.println("\nIl primo libro ha un voto migliore del secondo libro");
        else
            System.out.println("\nIl primo libro ha un voto peggiore del secondo");

        if (film1.isBetterThen(film2.getRecensione()) == 0)
            System.out.println("\nIl primo film e il secondo hanno lo stesso voto");
        else if (film1.isBetterThen(film2.getRecensione()) > 0)
            System.out.println("\nIl primo film ha un voto migliore del secondo film");
        else
            System.out.println("\nIl primo film ha un voto peggiore del ssecondo film");

            if(libro1.equals(libro2))
                System.out.println("\nI due libri sono uguali");
            else
                System.out.println("\nI due libri non sono uguali");

        // IntGrafica f = new IntGrafica();
        // f.setVisible(true);
    }
}
