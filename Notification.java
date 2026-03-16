package POLYMORPHISM;

class Notification {
    void send() {
        System.out.println("Sending notification via");
    }
    public static void main(String[] args) {
        Notification n;
        n = new EmailNotification();
        n.send();
        n = new SMSNotification();
        n.send();
        n = new PushNotification();
        n.send();
    }
}
class EmailNotification extends Notification {
    void send() {
        super.send();
        System.out.println("Email");
    }
}
class SMSNotification extends Notification {
    void send() {
        super.send();
        System.out.println("SMS");
    }
}
class PushNotification extends Notification {
    void send() {
        super.send();
        System.out.println("Push");
    }
}