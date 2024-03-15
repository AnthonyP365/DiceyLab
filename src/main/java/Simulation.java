public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    private Bins bins;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        bins = new Bins(numberOfDice, numberOfDice * 6);
    }

    public void runSimulation() {
        Dice dice = new Dice(numberOfDice);

        for (int i = 0; i < numberOfTosses; i++) {
            int toss = dice.tossAndSum();
            //int toss2 = dice.tossAndSum();
            //int totalToss = toss1 + toss2;
            bins.incrementBin(toss);
        }
    }

    public void printResults() {
        System.out.println("***\nSimulation of " + numberOfDice + " dice tossed for " + numberOfTosses + " times.\n***\n");

        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            double percentage = (double) bins.getBin(i) / numberOfTosses * 100;
            String stars = "*".repeat((int) percentage);
            System.out.printf("%2d : %9d: %.2f %s\n", i, bins.getBin(i), percentage, stars);
        }
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();
        sim.printResults();
    }
}
