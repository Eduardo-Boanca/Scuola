public class Orario {
        private int hh;
        private int mm;


        //costruttore
        public Orario(int myOra, int myMinuti) {
            this.hh = myOra;
            this.mm = myMinuti;
        }

        //costruttore copia
        public Orario(Orario ora1) {
            this.hh = ora1.getOra();
            this.mm = ora1.getMinuti();
        }

        //costruttore default
        public Orario()
        {}

        public int getOra() {
            return this.hh;
        }

        public void setOra(int myOra) {
            this.hh = myOra;
        }

        public int getMinuti() {
            return this.mm;
        }

        public void setMinuti(int myMinuti) {
            this.mm = myMinuti;
        }

        public void orarioToString() {
            System.out.println("Sono le ore "+this.getOra() + ":"+this.getMinuti());
        }

        
        public boolean equals(Orario auto2)
        {
            boolean correct = true;
            
            if((this.hh == auto2.getOra() && this.mm == auto2.getMinuti()))
                correct=true;
            return correct;
        }
}