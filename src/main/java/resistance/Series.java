package resistance;

public final class Series {

    private Series() {

    }

    public static double resistanceSeries(double... resistance) {
        double add = 0;

        for (Double r : resistance) {
            add += r;
        }
        return add;
    }
}
