import java.util.Random;

public class CoinToss {
    public static float coinFlip() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
}
