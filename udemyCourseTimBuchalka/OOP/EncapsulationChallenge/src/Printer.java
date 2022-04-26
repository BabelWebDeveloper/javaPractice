public class Printer {
    private String brand;
    private double tonerLevel;
    private int numberOFPages = 0;

    public Printer(String name, double tonerLevel) {
        this.brand = name;

        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
    }

    public boolean checkTonerLevel(){
        if (this.tonerLevel <= 0) {
            System.out.println("Toner is empty, please fill the toner.");
            return false;
        }
        else if (this.tonerLevel < 30){
            System.out.println("Actual level of toner is: " + tonerLevel + " % , please fill the toner.");
            return true;
        }
        return true;
    }

    public void fillToner(double toner){
        if (this.tonerLevel + toner > 100){
            System.out.println("Toner error");
        }
        this.tonerLevel +=  toner;
        System.out.println("Toner was filled, actual toner level is: " + this.tonerLevel);
    }

    public void printPage(int pagesForPrint, boolean duplex){
        int printedPages = 0;
        double printingCost = 0;
        double printFactor = 0;
        String printType;

        if (duplex){
            printingCost = 2;
            printFactor = 0.5;
            printType = "duplex";
        } else {
            printingCost = 1;
            printFactor = 1;
            printType = "regular";
        }

        while (checkTonerLevel() && printedPages < pagesForPrint){
            printedPages++;
            tonerLevel--;
        }
        printedPages += pagesForPrint % printingCost;
        printedPages *= printFactor;
        System.out.println("Printed pages: " + printedPages + " of " + printType + " printing. And toner level is: " + tonerLevel);
    }

    public String getName() {//hide form main
        return brand;
    }
}
