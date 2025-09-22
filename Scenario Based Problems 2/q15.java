interface IControllable {
    void turnOn();
    void turnOff();
    void reset();
}

abstract class Device implements IControllable {
    private String deviceId;
    private boolean status;
    private double energyUsage;

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    @Override
    public abstract void reset();
}

class Light extends Device {
    public Light(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Light " + getDeviceId() + " reset to default brightness.");
    }
}

class Camera extends Device {
    public Camera(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Camera " + getDeviceId() + " reset to factory settings.");
    }
}

class Thermostat extends Device {
    public Thermostat(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Thermostat " + getDeviceId() + " temperature set to default.");
    }
}

class Lock extends Device {
    public Lock(String deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Lock " + getDeviceId() + " reset to default security settings.");
    }
}

public class q15
 {
    public static void main(String[] args) {
        Light l1 = new Light("L001", 5.0);
        Camera c1 = new Camera("C001", 10.0);
        Thermostat t1 = new Thermostat("T001", 15.0);
        Lock lock1 = new Lock("LOCK001", 2.0);

        l1.turnOn();
        c1.turnOn();
        t1.turnOn();
        lock1.turnOn();

        l1.reset();
        c1.reset();
        t1.reset();
        lock1.reset();

        double totalEnergy = l1.getEnergyUsage() + c1.getEnergyUsage() + t1.getEnergyUsage() + lock1.getEnergyUsage();
        System.out.println("Total Energy Usage: " + totalEnergy + " kWh");
    }
}
