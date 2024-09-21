public class MaintenanceOperator extends Operator {
    public MaintenanceOperator(String name) {
        super(name, "Maintenance");
    }

    @Override
    public void notify(Sensor sensor, double value) {
        if (sensor.getSensorType().equals("Pressure") || sensor.getSensorType().equals("Fuel Level")) {
            if (value < sensor.getMinValue()) {
                System.out.println("Maintenance alert: " + name + " notified of low " + sensor.getSensorType() + ": " + value);
            }
        }
    }
}
