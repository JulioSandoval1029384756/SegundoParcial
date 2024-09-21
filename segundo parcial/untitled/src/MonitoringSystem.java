import java.util.ArrayList;
import java.util.List;

public class MonitoringSystem {
    private List<Sensor> sensors;
    private List<Operator> operators;

    public MonitoringSystem() {
        sensors = new ArrayList<>();
        operators = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public void addOperator(Operator operator, Sensor sensor) {
        sensor.addSubscriber(operator);
        operators.add(operator);
    }

    public void checkSensors() {
        for (Sensor sensor : sensors) {
            sensor.checkValue(Math.random() * 200);  // Simulando valores aleatorios fuera de rango
        }
    }
}
