public class Employee {
    private String name;
    private String address;
    private String workPosition;
    private int salary;

    public Employee(String name, String address, String workPosition, int salary) {
        this.name = name;
        this.address = address;
        this.workPosition = workPosition;
        this.salary = salary;
    }

    public static Employee createEmployee(String name, String address, String workPosition, int salary){
        return new Employee(name,address,workPosition,salary);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public int getSalary() {
        return salary;
    }
}
