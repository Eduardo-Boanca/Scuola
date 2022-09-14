public class Main {
    public static void main(String[] args) {
        PopCorn popcorn = new PopCorn();
        Cliente cliente = new Cliente(popcorn, "Cliente");
        Inserviente inserviente = new Inserviente(popcorn, "Inserviente");

        inserviente.start();
        cliente.start();

    }
}