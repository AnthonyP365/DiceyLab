import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void incrementBinTest() {
        Bins bins = new Bins(2, 12);

        bins.incrementBin(7);

        assert bins.getBin(7) == 1;
    }
}