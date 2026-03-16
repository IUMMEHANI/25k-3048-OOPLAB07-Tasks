package POLYMORPHISM;

class Employee {
    void calculateSalary() {
        System.out.println("Calculated salary of:");
    }
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        e.calculateSalary();
        e = new Developer();
        e.calculateSalary();
        e = new Intern();
        e.calculateSalary();
    }
}
class Manager extends Employee {
    void calculateSalary() {
        super.calculateSalary();
        System.out.println("Manager = 100000");
    }
}
class Developer extends Employee {
    void calculateSalary() {
        super.calculateSalary();
        System.out.println("Developer = 70000");
    }
}
class Intern extends Employee {
    void calculateSalary() {
        super.calculateSalary();
        System.out.println("Intern = 20000");
    }
}