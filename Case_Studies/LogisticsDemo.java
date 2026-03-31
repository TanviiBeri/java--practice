package Case_Studies;

// Abstract Class
abstract class Transport {
    protected String trackingId;
    protected String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    public abstract void dispatch();
}

// Interface 1 (with default method)
interface GPS {
    String getCoordinates();

    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

// Interface 2
interface Autonomous {
    void selfNavigate();
}

// DeliveryDrone Class
class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public String getCoordinates() {
        return "40 N, 74 W";
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

// Truck Class
class Truck extends Transport {

    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }
}


public class LogisticsDemo {
    public static void main(String[] args) {

        // Polymorphism
        Transport t1 = new DeliveryDrone("D101", "Mumbai");
        Transport t2 = new Truck("T201", "Delhi");

        t1.dispatch();
        t2.dispatch();

        // Direct interface reference (NO instanceof needed)
        GPS g = new DeliveryDrone("D102", "Pune");
        g.pingServer();
        System.out.println(g.getCoordinates());

        // Autonomous behavior
        Autonomous a = new DeliveryDrone("D103", "Bangalore");
        a.selfNavigate();
    }
}
