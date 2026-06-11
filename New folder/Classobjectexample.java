class Employee {
    // Attributes
    int empId;
    String name;
    int age;
    long phone;

    // Behaviors
    void working() {
        System.out.println("Employee is working");
    }

    boolean isActive() {
        return true;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Phone: " + phone);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.empId = 21;
        emp1.name = "Isham";
        emp1.age = 23;
        emp1.phone = 1234567890L;

        emp1.working();
        System.out.println("Is Active: " + emp1.isActive());
        emp1.display();
        
    }
}