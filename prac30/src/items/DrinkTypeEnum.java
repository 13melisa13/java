package items;

public enum DrinkTypeEnum {
    BEER("Alcohol"),
    VODKA("Alcohol"),
    WINE("Alcohol"),
    BRANDY("Alcohol"),
    TEQUILA("Alcohol"),
    RUM("Alcohol"),
    WHISKEY("Alcohol"),
    LIQUOR("Alcohol"),
    JAGERMEISTER("Alcohol"),
    JUICE("Non-alcohol"),
    COFFEE("Non-alcohol"),
    TEA("Non-alcohol"),
    MILK("Non-alcohol"),
    WATER("Non-alcohol");

    String[] alcohol = {"BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY, LIQUOR, JAGERMEISTER"};
    String type;
    DrinkTypeEnum(String type) {
        this.type = type;
    }

    public static DrinkTypeEnum[] getAlcohol(){
        return new DrinkTypeEnum[] {BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY, LIQUOR};
    }
    public boolean isAlcohol(){
        for (String t: alcohol){
            if (type == t)
                return true;
        }return false;
    }
    public static DrinkTypeEnum[] getNonAlcohol(){
        return new DrinkTypeEnum[] {JUICE, COFFEE, TEA, MILK, WATER};
    }

}
