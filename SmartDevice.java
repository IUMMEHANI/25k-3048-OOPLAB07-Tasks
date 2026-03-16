package POLYMORPHISM;

public class SmartDevice {
    void turnOn() {
        System.out.println("Device that is on is:");
    }
    public static void main(String[] args) {
        SmartDevice devices[] = {
                new SmartLight(),
                new SmartFan(),
                new SmartAC()
        };
        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }
}
class SmartLight extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Light");
    }
}
class SmartFan extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Fan");
    }
}
class SmartAC extends SmartDevice {
    void turnOn() {
        System.out.println("Smart AC");
    }
}