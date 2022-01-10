import java.lang.Math;

class Cerchio extends Punto {
    private int raggio;

    public Cerchio(int x, int y, int raggio) {
        super(x, y);
        this.raggio = raggio;
    }

    public Cerchio(Cerchio obj) {
        super(obj.getX(), obj.getY());
        this.raggio = getRaggio();
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    public int getRaggio() {
        return this.raggio;
    }

    public double getPerimetro() {
        return this.raggio * 2 * Math.PI;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.raggio, 2);
    }

    public void presentati() {
        System.out.println("Sono un cerchio");
        System.out.println(" Il punto centrale si trova:" + "\n" + "  X=" + this.getX() + "\n" + "  Y=" + this.getY()
                + "\n" + " Raggio: " + this.raggio + "\n" + " Perimetro: " + this.getPerimetro() + "\n" + " Area: "
                + this.getArea());
    }

    public boolean equals(Cerchio obj) {
        boolean equals = true;
        if (!(this.raggio == obj.getRaggio() && super.equals(obj)))
            equals = false;
        return equals;
    }

    public void disegna() {
        for (int i = 0; i <= getX() + getRaggio(); i++) {
            for (int j = 1; j <= getY() + getRaggio(); j++) {
                int xSquared = (i - getX()) * (i - getX());
                int ySquared = (j - getY()) * (j - getY());
                if (Math.abs(xSquared + ySquared - getRaggio() * getRaggio()) < getRaggio()) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}