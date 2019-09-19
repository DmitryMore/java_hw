package hw_2;

public class Trade {
    private TradeType type;
    private double price;

    public Trade(TradeType type, double price) {
        this.type = type;
        this.price = price;
    }

    public String type(){
        return type.name();
    }

    public double price(){
        return price;
    }
}
