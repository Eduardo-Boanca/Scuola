class Cubo extends Punto3D {
    private int lato;

    public Cubo(int x, int y, int z, int lato) {
        super(x, y, z);
        this.lato = lato;
    }

    public Cubo(Cubo oggetto) {
        super(oggetto.getX(), oggetto.getY(), oggetto.getZ());
        this.lato = getLato();
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public int getLato() {
        return this.lato;
    }

    public double getSuperficie() {
        return this.lato * this.lato * 6;
    }

    public double getVolume() {
        return this.lato * this.lato * this.lato;
    }

    public void presentati() {
        System.out.println("Sono un quadrato");
        System.out.println(" Punto centrale in posizione:" + "\n" + "  X=" + this.getX() + "\n" + "  Y=" + this.getY()
                + "\n" + " Dimensione lato: " + this.lato + "\n" + " Perimetro: " + this.getSuperficie() + "\n"
                + " Area: " + this.getVolume());
    }

    public boolean equals(Cubo oggetto) {
        boolean equals = true;
        if (!(this.lato == oggetto.getLato() && super.equals(oggetto)))
            equals = false;
        return equals;
    }
}