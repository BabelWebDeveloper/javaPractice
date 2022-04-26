public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company("MyCompany","San Francisco, 00-000, Silicon Valley","Przemek Babel");

        CompanyBranch branch1 = new CompanyBranch(myCompany.getName(), myCompany.getLocalization(), myCompany.getBoss(),"branch1" ,1000000.50,100000.50);

        CompanyBranch branch2 = new CompanyBranch(myCompany.getName(), myCompany.getLocalization(), myCompany.getBoss(),"branch2" ,700000.10,90000.10);

        Employee employee1 = new Employee(branch1.getSalesProfits(), branch1.getBills(), "John",1200,5000);
        Employee employee2 = new Employee(branch2.getSalesProfits(), branch2.getBills(), "Sam",1500,6000);

        //bez extends nie udało by się uzyskać poniższych informacji:
        System.out.println(branch1.getBoss());
        System.out.println(branch2.getBoss());
        System.out.println();

//        "wykonanie pracy" przez pracowników z branch1:
        System.out.println("Pracownik " + employee1.getEmployeeName() + " wykonał pracę.");
        branch1.productionIncome(employee1.getEarnings());
//        pobranie pensji przez pracownika z branch1:
        System.out.println("Pracownik " + employee1.getEmployeeName() + " odebrał wynagrodzenie.");
        branch1.productionCosts(employee1.getSalary());

        branch1.getNonTaxProfit();
        branch2.getNonTaxProfit();
        System.out.println();

        myCompany.getNonTaxProfit(branch1.getTotalBranchIncome(),branch2.getTotalBranchIncome());
        System.out.println();



    }
}
