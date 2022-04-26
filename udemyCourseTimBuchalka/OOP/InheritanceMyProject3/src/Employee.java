public class Employee extends CompanyBranch{
    private String employeeName;
    private double salary;
    private double earnings;

    public Employee(double salesProfits, double bills, String employeeName, double salary, double earnings) {
        super("myCompany","San Francisco, 00-000, Silicon Valley" ,"Przemek Babel", "branch1", salesProfits, bills);//wartości z poprznich rodziców przypisane w pliku - żeby było szybciej
        this.employeeName = employeeName;
        this.salary = salary;
        this.earnings = earnings;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        productionCosts(salary);
        return salary;
    }

    public double getEarnings() {
        productionIncome(earnings);
        return earnings;
    }
}
