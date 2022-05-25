public class Main {
    public static void main(String[] args) {
        PopCornMachine popcorn = new PopCornMachine();
        Thread cliente = new Cliente(new Cliente(popcorn));
        Thread inserviente = new Cliente(new Cliente(popcorn));

    }
}