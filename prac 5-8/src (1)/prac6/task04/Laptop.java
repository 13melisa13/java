package prac6.task04;

public class Laptop implements Priceable{
    String type;
    Double price;

    public Laptop(String type, double price){
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{type=%s, price=%.2f}".formatted(   type ,price );
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
