public class DichotomicHacker extends Thread {
   
    private int max_number;
    private int min_number;
    private int pass_code;

    public DichotomicHacker(int Max_number, int Min_number, int ThePass_code) {
        this.pass_code = ThePass_code;
        this.max_number = Max_number;
        this.min_number = Min_number;
        this.setName("Dichotomic Hacker");
    }

    public int getPass_code() {
        return this.pass_code;
    }

    public void setPass_code(int ThePass_code) {
        this.pass_code = ThePass_code;
    }

    public int getMax_number() {
        return this.max_number;
    }

    public void setMax_number(int Max_number) {
        this.max_number = Max_number;
    }

    public int getMin_number() {
        return this.min_number;
    }

    public void setMin_number(int Min_number) {
        this.min_number = Min_number;
    }

    public void setStartNumber(int start_number) {
        this.max_number = start_number;
    }

    @Override
    public void run() {
        boolean passGuessed = false;
        int middle_number;
        max_number = Main.MAXNUMBER;
        min_number = Main.MINNUMBER;
        

        do {
            middle_number = (max_number + min_number) / 2;
            if (middle_number == this.pass_code)
                passGuessed = true;

            if (middle_number > this.pass_code)
                max_number = middle_number - 1;
            else
                min_number = middle_number + 1;

            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (min_number <= max_number && Main.running);

        if (passGuessed == true)
            System.out.println("The Password has been guessed by " + currentThread().getName() + ", it was: " + getPass_code());
        Main.running = false;
    }

    @Override
    public void start() {
        System.out.println("DICHOTOMIC TYPE HACKER STARTED");
        super.start();
    }

}
