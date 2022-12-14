package items;

public enum DrinkTypeEnum {
    BEER("Alcohol", 7),
    VODKA("Alcohol", 40),
    WINE("Alcohol", 17),
    BRANDY("Alcohol", 36),
    TEQUILA("Alcohol", 42),
    RUM("Alcohol" ,45),
    WHISKEY("Alcohol" ,45),
    LIQUOR("Alcohol",12),
    JAGERMEISTER("Alcohol",40),
    JUICE("Non-alcohol",0),
    COFFEE("Non-alcohol" ,0),
    TEA("Non-alcohol" ,0),
    MILK("Non-alcohol", 0),
    WATER("Non-alcohol",0);

    final String type;
    final public int vol;
    DrinkTypeEnum(String type, int vol) {
        this.type = type;
        this.vol = vol;
    }

    public static DrinkTypeEnum[] getAll(){
        return new DrinkTypeEnum[] {BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY, LIQUOR,JAGERMEISTER,JUICE, COFFEE, TEA, MILK, WATER};
    }
    public boolean isAlcohol(){
            if (vol == 0) return false;
            return true;
    }

}
