public class ManagementOperator extends Operator {
    public ManagementOperator(String name) {
        super(name, "Management");
    }

    @Override
    public void notify(Sensor sensor, double value) {
        System.out.println("Critical alert: " + name + " notified of critical issue with " + sensor.getSensorType() + ": " + value);
    }
}
