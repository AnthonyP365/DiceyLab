public class Bins {
    private int[] results;
    private int min;

    public Bins(int min, int max) { // bin array the exact size of the max roll and min roll
        this.min = min;
        results = new int[max - min + 1];
    }

    public void incrementBin(int bin) { // increment the correct bin number
        results[bin - min]++;
    }

    public int getBin(int bin) { // returns the correct bin number for dice roll amount
        return results[bin - min];
    }

}
