public abstract class Operator {
    protected String name;
    protected String operatorType;

    public Operator(String name, String operatorType) {
        this.name = name;
        this.operatorType = operatorType;
    }

    public abstract void notify(Sensor sensor, double value);
}
