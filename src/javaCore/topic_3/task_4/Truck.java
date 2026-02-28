package javaCore.topic_3.task_4;

public class Truck implements Shippable<Cargo> {

    private static final double MAX_WEIGHT = 1000.0;
    private final boolean hasRefrigerator;

    public Truck(boolean hasRefrigerator) {
        this.hasRefrigerator = hasRefrigerator;
    }

    @Override
    public void ship(Cargo cargo) throws OverweightException {
        if (cargo.getWeight() > MAX_WEIGHT) {
            throw new OverweightException(MAX_WEIGHT, cargo.getWeight());
        }

        if (cargo.getType().isTemperatureRegime() && !this.hasRefrigerator) {
            throw new IllegalStateException("Ошибка: Грузовик без рефрижератора не может везти " + cargo.getName());
        }

        System.out.println("Успех! Груз '" + cargo.getName() + "' отправлен.");
    }



}
