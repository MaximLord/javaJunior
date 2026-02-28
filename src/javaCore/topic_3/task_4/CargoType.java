package javaCore.topic_3.task_4;

public enum CargoType {
    CLOTHES (false),
    ELECTRONICS (false),
    FOOD (true);

    private final boolean temperatureRegime;

    CargoType(boolean temperatureRegime){
        this.temperatureRegime = temperatureRegime;
    }

    public boolean isTemperatureRegime() {
        return temperatureRegime;
    }

}
