import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Company myCompany = new Company("Przemo industries");

    public static void main(String[] args) {

        boolean quit = false;
        launchingCrm();
        printInstructions();

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myCompany.listOfEmployees();
                    break;
                case 2:
                    recruit();
                    break;
                case 3:
                    fire();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    myCompany.sumOfSalaries();
                    break;
                case 7:
                    System.out.println("CRM is shutting down...");
                    quit = true;
            }
        }
    }

    private static void launchingCrm(){
        System.out.println("CRM is launched.");
    }

    private static void printInstructions(){
        System.out.println("Select your choice and press enter:");
        System.out.println(" 0 -> Print instructions\n" +
                " 1 -> Print employees list\n" +
                " 2 -> Hire new employee\n" +
                " 3 -> Fire employee\n" +
                " 4 -> Update employee\n" +
                " 5 -> Find employee in your company\n" +
                " 6 -> Print sum of all salaries\n" +
                " 7 -> Quit CRM");
    }

    private static void recruit(){
        System.out.println("Enter new employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter new employee address:");
        String address = scanner.nextLine();
        System.out.println("Enter new employee work position:");
        String workPosition = scanner.nextLine();
        System.out.println("Enter new employee salary:");
        int salary = scanner.nextInt();
        Employee newEmployee = Employee.createEmployee(name,address,workPosition,salary);

        if (myCompany.recruitEmployee(newEmployee)){
            System.out.println("Employee successfully recruited!");
        } else {
            System.out.println("Error in recruiting process!");
        }
    }

    private static void fire(){
        System.out.println("Enter new employee name:");
        String name = scanner.nextLine();
        Employee employee = myCompany.findEmployee(name);

        if(employee != null){
            String decision;
            do {
                System.out.println("Do you really want to fire this employee? Type \"yes\" or \"no\".");
                decision = scanner.nextLine();
                if (decision.equals("yes")){
                    myCompany.fireEmployee(employee);
                    System.out.println("Employee successfully fired from company!");
                } else if (decision.equals("no")){
                    System.out.println("Employee doesn't fired...yet.");
                }
            } while (!(decision.equals("yes") || decision.equals("no")));

        } else {
            System.out.println("We don't have such employee...");
        }
    }

    private static void update(){
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        Employee employeeOldData = myCompany.findEmployee(name);

        if(employeeOldData != null){
            System.out.println("Enter employee address:");
            String address = scanner.nextLine();
            System.out.println("Enter employee work position:");
            String workPosition = scanner.nextLine();
            System.out.println("Enter employee salary:");
            int salary = scanner.nextInt();

            Employee updatedEmployee = Employee.createEmployee(name,address,workPosition,salary);

            myCompany.updateEmployee(employeeOldData,updatedEmployee);
        } else {
            System.out.println("We don't have such employee...");
        }
    }

    private static void find(){
        System.out.println("Enter employee name to be find:");
        String name = scanner.nextLine();
        myCompany.findEmployee(name);
    }
}
