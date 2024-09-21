public class SecurityOperator extends Operator {
    public SecurityOperator(String name) {
        super(name, "Security");
    }

    @Override
    public void notify(Sensor sensor, double value) {
        if (sensor.getSensorType().equals("Temperature") || sensor.getSensorType().equals("Pressure")) {
            if (value > sensor.getMaxValue()) {
                System.out.println("Security alert: " + name + " notified of high " + sensor.getSensorType() + ": " + value);
            }
        }
    }
}

