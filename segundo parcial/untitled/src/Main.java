public class Main {
    public static void main(String[] args) {

        Sensor temperatureSensor = new Sensor("Temperature", 0, 100);
        Sensor pressureSensor = new Sensor("Pressure", 10, 150);
        Sensor fuelLevelSensor = new Sensor("Fuel Level", 5, 50);


        Operator securityOperator = new SecurityOperator("Security Team");
        Operator maintenanceOperator = new MaintenanceOperator("Maintenance Team");
        Operator managementOperator = new ManagementOperator("Management Team");


        MonitoringSystem monitoringSystem = new MonitoringSystem();


        monitoringSystem.addSensor(temperatureSensor);
        monitoringSystem.addSensor(pressureSensor);
        monitoringSystem.addSensor(fuelLevelSensor);


        monitoringSystem.addOperator(securityOperator, temperatureSensor);
        monitoringSystem.addOperator(securityOperator, pressureSensor);
        monitoringSystem.addOperator(maintenanceOperator, pressureSensor);
        monitoringSystem.addOperator(maintenanceOperator, fuelLevelSensor);
        monitoringSystem.addOperator(managementOperator, temperatureSensor);
        monitoringSystem.addOperator(managementOperator, pressureSensor);


        monitoringSystem.checkSensors();
    }
}
