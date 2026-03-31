package Case_Studies;

// Abstract Class
abstract class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
}

// Interface 1
interface RemoteControllable {
    void connectToWifi();
}

// Interface 2
interface PowerSaving {
    String getEnergyRating();
}

// SmartTV Class
class SmartTV extends Device implements RemoteControllable, PowerSaving {

    public SmartTV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV is booting up...");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connecting to Home_5G...");
    }

    @Override
    public String getEnergyRating() {
        return "A+";
    }
}

// ElectricKettle Class
class ElectricKettle extends Device {

    public ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Kettle is heating water...");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {

        // TC 1: Upcasting
        Device d = new SmartTV("Sony");
        d.turnOn();

        // TC 2: Interface reference
        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();

        // TC 3: Uncomment → Compile-time error
        // r.turnOn();  not allowed
    }
}