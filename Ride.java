package POLYMORPHISM;

class Ride {
    double calculateFare(double distance) {
        return 0;
    }
    public static void main(String[] args) {
        Ride r;
        r = new BikeRide();
        System.out.println("Bike Fare = " + r.calculateFare(10));
        r = new CarRide();
        System.out.println("Car Fare = " + r.calculateFare(10));
        r = new LuxuryRide();
        System.out.println("Luxury Fare = " + r.calculateFare(10));
    }
}
class BikeRide extends Ride {
    double calculateFare(double distance) {
        return distance * 5;
    }
}
class CarRide extends Ride {
    double calculateFare(double distance) {
        return distance * 10;
    }
}
class LuxuryRide extends Ride {
    double calculateFare(double distance) {
        return distance * 20;
    }
}
