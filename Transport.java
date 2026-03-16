package POLYMORPHISM;

public class Transport {
    void fare() {
        System.out.println("Fare of:");
    }
    public static void main(String[] args) {
        Transport t;
        t = new Bus();
        t.fare();
        t = new Train();
        t.fare();
        t = new Taxi();
        t.fare();
    }
}
class Bus extends Transport {
    void fare() {
        super.fare();
        System.out.println("Bus = 50");
    }
}
class Train extends Transport {
    void fare() {
        super.fare();
        System.out.println("Train = 100");
    }
}
class Taxi extends Transport {
    void fare() {
        super.fare();
        System.out.println("Taxi = 300");
    }
}