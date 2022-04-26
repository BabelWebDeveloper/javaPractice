public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;//initialized to 0, if error move to constructor
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <= -1 || tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public void addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return;
            } else {
                this.tonerLevel += tonerAmount;
            }
            System.out.println("Toner level is: " + this.tonerLevel);
        } else {
            return;
        }
    }

    public void printPages(int pages){
        int initialPages = pages;
        int printedPages = 0;
        while (pages >= 0){
            if (this.tonerLevel > 0){
                pages--;
                printedPages++;
                this.tonerLevel--;
            } else {
                System.out.println("Not enough toner level! Printed pages: " + printedPages + ", pages left: " + (initialPages - printedPages));
                break;
            }
        }
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
