package items;

public final class Drink extends Item implements Alcoholable{
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(String description, String name, int cost ,DrinkTypeEnum type, int  alcoholVol) throws Exception {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }
    public DrinkTypeEnum getType(){
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
