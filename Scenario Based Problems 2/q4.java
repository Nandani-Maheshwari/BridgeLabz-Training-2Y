interface Controllable {
    void turnOn();
    void turnOff();
}

abstract class Appliance implements Controllable {
    private boolean isOn;
    private int powerUsage;

    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean on) {
        this.isOn = on;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public boolean compareUsage(Appliance other) {
        return this.powerUsage > other.powerUsage;
    }
}

class Light extends Appliance {
    public Light(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light is turned on.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light is turned off.");
    }
}

class Fan extends Appliance {
    public Fan(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan is running.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan is stopped.");
    }
}

class AC extends Appliance {
    public AC(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC is cooling.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC is off.");
    }
}

class UserController {
    public void controlAppliance(Controllable device, boolean on) {
        if (on) device.turnOn();
        else device.turnOff();
    }
}

public class q4{
    public static void main(String[] args) {
        Light light = new Light(60);
        Fan fan = new Fan(75);
        AC ac = new AC(1500);

        UserController controller = new UserController();
        controller.controlAppliance(light, true);
        controller.controlAppliance(fan, true);
        controller.controlAppliance(ac, true);

        System.out.println("AC uses more power than Fan: " + ac.compareUsage(fan));
    }
}
