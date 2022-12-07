import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] keys = { "Бри Ван Де Камп", "Бри Ходж", "Сьюзан Майер",
                "Линнет Скаво","Габриела Салис"};
        HashTable table = new HashTable();
        for (String key:keys) {
            table.add(key);
        }
        System.out.println(table);
        System.out.println(table.getElem(table.find("Линнет Скаво")));
        System.out.println(table);
        System.out.println(table.delete("Габриела Салис"));
        System.out.println(table);
        System.out.println(table.getElem(table.find("Габриела Салис")));
        System.out.println(table);
    }
}