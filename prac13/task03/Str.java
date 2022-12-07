package prac13.task03;

public class Str {
    public static void method(String str){
        System.out.println(str.charAt(str.length()-1));
    }
    public static void main(String[] args) {
        String str = "I like Java!!!";
        method(str);
        if (str.endsWith("!!!")&&str.startsWith("I like")&&str.contains("Java")){
            System.out.println(str.indexOf("Java"));
            System.out.println(str.substring(str.indexOf("Java"),str.indexOf("Java")+"Java".length()));
            System.out.println(str.replaceAll("a", "o"));
            System.out.println(str.toLowerCase());
            System.out.println(str.toUpperCase());
        }
    }
}
