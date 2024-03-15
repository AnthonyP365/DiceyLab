import java.util.Random;

public class Dice {
    private int dice;
    private Random random;

    public Dice(int dice) {
        this.dice = dice;
        this.random = new Random();
    }

    public int tossAndSum() {
        int sum = 0;

        for (int i = 0; i < dice; i++) {
            sum += random.nextInt(6)+1;
        }

        return sum;
    }

}
