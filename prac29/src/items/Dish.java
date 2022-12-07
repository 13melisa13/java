package items;


public final class Dish implements Item{
    private final int cost;
    private final String name;
    private final String description;

    public Dish ( String name, String description,int cost) throws IllegalArgumentException {
        this.cost = cost;
        this.name = name;
        this.description = description;
        if (cost < 0 || name.isEmpty() || description.isEmpty())
            throw new IllegalArgumentException();
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
