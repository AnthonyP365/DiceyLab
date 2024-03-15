import org.junit.Assert;
import org.junit.Test;


public class DiceTest {

    @Test
    public void testTossAndSum() {
        Dice dice = new Dice(2);

        int toss = dice.tossAndSum();

        Assert.assertTrue(toss >= 2 && toss <= 12);
        System.out.println(dice.tossAndSum());
    }
}