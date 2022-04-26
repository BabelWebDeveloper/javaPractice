import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<Employee>();
    }

    private int searchEmployee(Employee employee){//return index of employee
        return this.employees.indexOf(employee);
    }

    private int searchEmployee(String name){
        for (int i = 0; i < this.employees.size(); i++){
            Employee employee = this.employees.get(i);
            if (employee.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

//    szukanie pracowników:
    public Employee findEmployee(String name){
        int result = searchEmployee(name);
        if (result >= 0){
            String employeeName = this.employees.get(result).getName();
            String employeeWorkPosition = this.employees.get(result).getWorkPosition();
            int employeeSalary = this.employees.get(result).getSalary();
            String employeeAddress = this.employees.get(result).getAddress();

            System.out.println("Worker found, name: " + employeeName + ", live in " + employeeAddress + ", work as " + employeeWorkPosition + ", the salary is " + employeeSalary);

            return this.employees.get(result);
        }

        System.out.println("We don't have such employee.");
        return null;
    }

//    rekrutowanie pracowników:
    public boolean recruitEmployee(Employee employee){
        return this.employees.add(employee);
    }

//    zwalnianie pracowników:
    public boolean fireEmployee(Employee employee){
        int result = searchEmployee(employee);
        if (result < 0){
            System.out.println("We don't have such employee.");
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

//    aktualizowanie danych pracowników:
    public boolean updateEmployee(Employee oldData, Employee newData){
        int result = searchEmployee(oldData);
        if (result < 0){
            System.out.println("We don't have such employee.");
            return false;
        }
        this.employees.set(result,newData);
        System.out.println("Data employee successfully updated: ");
        findEmployee(newData.getName());
        return true;
    }

//    wyświetlanie listy pracowników:
    public void listOfEmployees(){
        System.out.println("Here is list of employees in your company:");
        for (int i = 0; i < this.employees.size(); i++){
            Employee employee = this.employees.get(i);
            System.out.println((i + 1) + ". " + employee.getName() + ", live in " + employee.getAddress() + ", work as " + employee.getWorkPosition() + ", the salary is " + employee.getSalary());
        }
    }

    public void sumOfSalaries(){
        System.out.println("Here is sum of salaries of all employees:");
        int sum = 0;
        for (int i = 0; i < this.employees.size(); i++){
            Employee employee = this.employees.get(i);
            sum += employee.getSalary();
        }
        System.out.println("Sum of all salaries equal: " + sum);
    }
}
