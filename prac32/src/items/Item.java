package items;

import java.io.Serializable;

public class Item implements Serializable {
    private int cost;
    private String name;
    private String description;

    public Item (int cost, String name, String description) throws Exception {
        this.cost = cost;
        this.name = name;
        this.description = description;
        if (cost < 0 || name.isEmpty() || description.isEmpty())
            throw new Exception("Item Exception");
    }


    public int getCost() {
        return cost;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }
}
