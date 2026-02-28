package javaCore.topic_3.task_1;

public enum CoffeeSize {
    SMALL(1.0, 0.2),
    MEDIUM(1.5, 0.3),
    LARGE(2.0, 0.4);

    private final double priceMultiplier; // Поле для коэффициента цены
    private final double milliliters;    // Поле для объема

    CoffeeSize(double priceMultiplier, double milliliters) {
        this.priceMultiplier = priceMultiplier;
        this.milliliters = milliliters;
    }


    public double calculatePrice(double basePrice) {
        return basePrice * this.priceMultiplier;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
