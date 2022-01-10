class Parallelepipedo extends Punto3D {
    private int larghezza;
    private int lunghezza;
    private int altezza;

    public Parallelepipedo(int x, int y, int z, int larghezza, int lunghezza, int altezza) {
        super(x, y, z);
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    public Parallelepipedo(Parallelepipedo oggetto) {
        super(oggetto.getX(), oggetto.getY(), oggetto.getZ());
        this.larghezza = getLarghezza();
        this.lunghezza = getLunghezza();
        this.altezza = getAltezza();
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getLarghezza() {
        return this.larghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getLunghezza() {
        return this.lunghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getAltezza() {
        return this.altezza;
    }

    public double getSuperficie() {
        return 2 * (larghezza * lunghezza + larghezza * altezza + lunghezza * altezza);
    }

    public double getVolume() {
        return larghezza * lunghezza * altezza;
    }

    public void presentati() {
        System.out.println("Sono un parallelepipedo");
        System.out.println(" Punto centrale in posizione:" + "\n" + "  X=" + this.getX() + "\n" + "  Y=" + this.getY()
                + "\n" + "  Z=" + this.getZ() + "\n" + " Larghezza: " + this.larghezza + "\n" + " Lunghezza: "
                + this.lunghezza + "\n" + " Altezza: " + this.altezza + "\n" + " Superficie: " + this.getSuperficie()
                + "\n" + " Volume: " + getVolume());
    }

    public boolean equals(Parallelepipedo oggetto) {
        boolean equals = true;
        if (!(this.larghezza == oggetto.getLarghezza() && this.lunghezza == oggetto.getLunghezza()
                && this.altezza == oggetto.getAltezza() && super.equals(oggetto)))
            equals = false;
        return equals;
    }
}