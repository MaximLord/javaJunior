package javaCore.topic_3.task_5;

public enum Currency {
    USD(1.0),
    EUR(0.92),
    RUB(91.5);

    private final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
