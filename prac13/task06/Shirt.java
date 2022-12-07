package prac13.task06;

public class Shirt {
    String fashion = "";
    String type = "";
    String color = "";
    String size = "";
    Shirt (String str){
        String[] shirt = str.split(",");
        if (shirt.length > 3) {
            fashion = shirt[0];
            type = shirt[1];
            color = shirt[2];
            size = shirt[3];
        }
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "fashion='" + fashion + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
