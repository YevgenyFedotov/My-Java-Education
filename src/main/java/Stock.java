public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public static void main(String[] args) {
        Stock stock = new Stock("ПАО Сбербанк", "SBER");
        stock.previousClosingPrice = 120;
        stock.currentPrice = 100;
        System.out.println(stock.getChangePercent());
    }

    public Stock(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice*100;
    }
}
