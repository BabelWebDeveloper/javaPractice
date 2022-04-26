public class Company {
    private String name;
    private String localization;
    private String boss;

    public Company(String name, String localization, String boss) {
        this.name = name;
        this.localization = localization;
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public String getLocalization() {
        return localization;
    }
    String address = getLocalization();

    public String getBoss() {
        return boss;
    }

    public void getNonTaxProfit(){
        System.out.println("non-tax profit called");
    }

    public void getNonTaxProfit(double branch1Income, double branch2Income) {
        double nonTaxProfit = branch1Income + branch2Income;
        System.out.println("nonTaxProfit was: " + nonTaxProfit);
    }
}
