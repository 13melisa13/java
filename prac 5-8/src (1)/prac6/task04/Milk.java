package prac6.task04;

public class Milk extends Food {
    protected Double weight ;

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Double getPrice() {
        return count * unitPrice * weight;
    }

    @Override
    public String toString() {
        return "Milk{weight=%.2f, count=%d, unitPrice=%.2f}".formatted(weight, count, unitPrice);
    }
}
