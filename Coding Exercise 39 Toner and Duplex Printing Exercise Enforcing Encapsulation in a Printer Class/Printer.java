public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ?
            tonerLevel : -1;
        this.duplex = duplex;
    }
    
    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount + tonerLevel > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    
    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? pages / 2 + pages % 2 : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
}

