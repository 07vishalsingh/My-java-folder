import java.util.random.RandomGenerator;

public class Random {
    public static void main(String[] args) {
        Random random = new Random();
        int x = ((RandomGenerator) random).nextInt();

        System.out.println(x);
    }
}
