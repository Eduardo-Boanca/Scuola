import java.util.Scanner;

public class Lista {
    private Nodo firstPosition = null;

    public Lista() {
    }

    public void inserisci() {
        Scanner scan = new Scanner(System.in);
        Nodo obj = new Nodo();
        boolean added = false;

        System.out.println("Inserisci il nome: ");
        obj.getPersona().setName(scan.next());

        System.out.println("Inserisci il cognome: ");
        obj.getPersona().setSurname(scan.next());

        do {
            System.out.println("Inserisci giorno di nascita: ");
            obj.getPersona().setDayBirth(scan.next());
            System.out.println("Inserisci mese di nascita: ");
            obj.getPersona().setMonthBirth(scan.next());
            System.out.println("Inserisci anno di nascita: ");
            obj.getPersona().setYearBirth(scan.next());
        } while (!obj.getPersona().checkDate());

        if (firstPosition == null)
            firstPosition = obj;
        else if (firstPosition.getPersona().compareTo(obj.getPersona()) > 0) {
            obj.setSuccessivo(firstPosition);
            firstPosition = obj;
        } else {
            Nodo tmp = firstPosition;
            while (!added) {
                if (tmp.getSuccessivo() == null) {
                    obj.setSuccessivo(null);
                    tmp.setSuccessivo(obj);
                    added = true;
                } else if (tmp.getSuccessivo().getPersona().compareTo(obj.getPersona()) > 0) {
                    obj.setSuccessivo(tmp.getSuccessivo());
                    tmp.setSuccessivo(obj);
                    added = true;
                } else
                    tmp = tmp.getSuccessivo();
            }
        }
    }

    public void elimina() {
        if (firstPosition == null)
            System.out.println("La lista è vuota");
        else {
            Scanner scan = new Scanner(System.in);
            Nodo tmp = firstPosition;
            boolean fine = false;
            System.out.println("Inserisci il nome della persona da eliminare:");
            String nome = scan.next();
            System.out.println("Inserisci il cognome della persona da eliminare:");
            String cognome = scan.next();
            if (firstPosition.getSuccessivo() == null) {
                if (nome.equals(firstPosition.getPersona().getName())
                        || cognome.equals(firstPosition.getPersona().getSurname())) {
                    firstPosition = null;
                }
            } else
                while (!fine) {
                    if (tmp.getSuccessivo() == null) {
                        System.out.println("Persona non trovata");
                        fine = true;
                    } else if (nome.equals(tmp.getSuccessivo().getPersona().getName())
                            || cognome.equals(tmp.getSuccessivo().getPersona().getSurname())) {
                        tmp.setSuccessivo(tmp.getSuccessivo().getSuccessivo());
                        fine = true;
                    } else
                        tmp = tmp.getSuccessivo();
                }
        }
    }

    public void stampa() {
        Nodo tmp = firstPosition;
        while (tmp != null) {
            tmp.getPersona().presentati();
            tmp = tmp.getSuccessivo();
        }
    }

    
    /** 
     * @return boolean
     */
    public boolean contiene() {
        boolean isThere = false;
        if (firstPosition == null)
            isThere = false;
        else {
            Scanner scan = new Scanner(System.in);
            Nodo tmp = firstPosition;
            boolean fine = false;
            System.out.println("Inserisci il nome della persona da trovare:");
            String nome = scan.next();
            System.out.println("Inserisci il cognome della persona da trovare:");
            String cognome = scan.next();
            while (!fine) {
                if (nome.equals(tmp.getPersona().getName()) || cognome.equals(tmp.getPersona().getSurname())) {
                    tmp.setSuccessivo(tmp.getSuccessivo().getSuccessivo());
                    isThere = true;
                    fine = true;
                } else if (tmp.getSuccessivo() == null) {
                    isThere = false;
                    fine = true;
                } else
                    tmp = tmp.getSuccessivo();
            }
        }
        return isThere;
    }
}