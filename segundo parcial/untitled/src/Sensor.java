import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private String sensorType;
    private double minValue;
    private double maxValue;
    private List<Operator> subscribers;

    public Sensor(String sensorType, double minValue, double maxValue) {
        this.sensorType = sensorType;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Operator subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(double value) {
        for (Operator subscriber : subscribers) {
            subscriber.notify(this, value);
        }
    }

    public void checkValue(double value) {
        if (value < minValue || value > maxValue) {
            notifySubscribers(value);
        }
    }

    public String getSensorType() {
        return sensorType;
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }
}
