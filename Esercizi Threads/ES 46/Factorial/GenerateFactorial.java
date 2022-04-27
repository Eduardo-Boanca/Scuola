
public class GenerateFactorial {
    private int range = (Main.MAX_RAND_NUM - Main.MIN_RAND_NUM);
    private int numRand = (int) (Math.random() * range) + Main.MIN_RAND_NUM;

    public int getNumRand() {
        return numRand;
    }
}
