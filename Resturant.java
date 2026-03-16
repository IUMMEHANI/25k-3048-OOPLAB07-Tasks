package POLYMORPHISM;

class Restaurant {
    double calculateDeliveryFee(double distance) {
        return 0;
    }
    public static void main(String[] args) {
        Restaurant r;
        r = new FastFoodRestaurant();
        System.out.println("FastFood Delivery Fee = " + r.calculateDeliveryFee(50));
        r = new FineDiningRestaurant();
        System.out.println("FineDining Delivery Fee = " + r.calculateDeliveryFee(67));
        r = new CafeRestaurant();
        System.out.println("Cafe Delivery Fee = " + r.calculateDeliveryFee(32));
    }
}
class FastFoodRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 25;
    }
}
class FineDiningRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 20;
    }
}
class CafeRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 39;
    }
}