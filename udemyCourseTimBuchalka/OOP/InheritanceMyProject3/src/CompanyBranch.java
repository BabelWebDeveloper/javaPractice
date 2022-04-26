public class CompanyBranch extends Company{
    private String nameOfFila;
    private double salesProfits;
    private double bills;

    private double productionProfits = 0.50;
    private double fixedCosts = 0;

    public CompanyBranch(String name, String localization, String boss, String nameOfFila, double salesProfits, double bills) {
        super(name, localization, boss);
        this.nameOfFila = nameOfFila;
        this.salesProfits = salesProfits;
        this.bills = bills;
    }

    public void productionIncome(double employee){
        productionProfits += employee;
    }

    public void productionCosts(double employee){
        fixedCosts += employee;
    }

    @Override
    public void getNonTaxProfit() {
        System.out.println("Income from " + getNameOfFila() + " was: " + (getSalesProfits() + getProductionProfits()));
        super.getNonTaxProfit();//opcjonalne - wywołanie fuknkcji rodzica
    }

    public String getNameOfFila() {
        return nameOfFila;
    }

    public double getSalesProfits() {
        return salesProfits;
    }

    public double getBills() {
        return bills;
    }

    public double getProductionProfits() {
        return productionProfits;
    }

    public double getTotalBranchIncome() {
        return (productionProfits + salesProfits) - (fixedCosts + bills);
    }

}
