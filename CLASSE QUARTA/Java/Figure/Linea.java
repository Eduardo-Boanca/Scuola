class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(int x1, int y1, int x2, int y2) {
        punto1 = new Punto(x1, y1);
        punto2 = new Punto(x2, y2);
    }

    public Linea(Linea obj) {
        punto1 = new Punto(obj.getX1(), obj.getY2());
        punto2 = new Punto(obj.getX2(), obj.getY2());
    }

    public void setX1(int x) {
        punto1.setX(x);
    }

    public int getX1() {
        return punto1.getX();
    }

    public void setY1(int y) {
        punto1.setY(y);
    }

    public int getY1() {
        return punto1.getY();
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setX2(int x) {
        punto2.setX(x);
    }

    public int getX2() {
        return punto2.getX();
    }

    public void setY2(int y) {
        punto2.setY(y);
    }

    public int getY2() {
        return punto2.getY();
    }

    public Punto getPunto2() {
        return punto2;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
    }

    public void presentati() {
        System.out.println("Sono una linea");
        System.out.println(" Punto 1 in posizione:" + "\n" + "  X=" + punto1.getX() + "\n" + "  Y=" + punto1.getY()
                + "\n" + " Punto 2 in posizione:" + "\n" + "  X=" + punto2.getX() + "\n" + "  Y=" + punto2.getY() + "\n"
                + " Lunghezza=" + getDistance());
    }

}