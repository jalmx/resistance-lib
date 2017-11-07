package resistance;

public final class Parallel {

    private Parallel() {

    }

    public static double resistanceParallel(double... resistance) {

        double add = 0;

        for (Double r : resistance) {
            add += 1 / r;
        }

        return 1 / add;
    }
}
