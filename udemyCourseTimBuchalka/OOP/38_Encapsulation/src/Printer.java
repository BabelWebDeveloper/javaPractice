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

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
            }
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint;
        if (duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages / 2 + pages % 2;
        } else {
            pagesToPrint = pages;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
