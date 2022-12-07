package task2;

import java.util.HashMap;
import java.util.HashSet;


public class Map{
    public static HashMap<String, String> createMap() {
        HashMap <String,String> hashMap= new HashMap<>();
        hashMap.put("Фамилия1", "Имя3");
        hashMap.put("Фамилия2", "Имя3");
        hashMap.put("Фамилия3", "Имя3");
        hashMap.put("Фамилия4", "Имя3");
        hashMap.put("Фамилия5", "Имя3");
        hashMap.put("Фамилия5", "Имя3");
        hashMap.put("Фамилия5", "Имя7");
        hashMap.put("Фамилия8", "Имя8");
        hashMap.put("Фамилия9", "Имя9");
        hashMap.put("Фамилия10", "Имя10");
        return  hashMap;
    }

    private static int getSameLastNameCount(HashMap<String, String> map) {
        HashSet lastNameSet = new HashSet<String>();
        for (var entry : map.entrySet())
            lastNameSet.add(entry.getKey());
        return map.entrySet().size() - lastNameSet.size();
    }

    private static int getSameFirstNameCount(HashMap<String, String> map) {
        var firstNameSet = new HashSet<String>();
        for (var entry : map.entrySet())
            firstNameSet.add(entry.getValue());
        return map.entrySet().size() - firstNameSet.size();
    }

    public static void main(String[] args) {
        HashMap <String, String> hm = createMap ();
       // System.out.println(getSameFirstNameCount (hm));  //return 0 cause surname is Key
       // System.out.println(getSameLastNameCount(hm));
    }
}

