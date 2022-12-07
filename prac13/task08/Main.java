package prac13.task08;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static StringBuilder getLine(String[] words) {

        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length==1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(words));

        while (wordsList.remove("")){
            wordsList.remove("");
        }
        while (toShuffle(wordsList)) {
            Collections.shuffle(wordsList);
        }
        for (String word: wordsList){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }
    public static boolean toShuffle(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String nameOfFile = in.nextLine();
        File file = new File(nameOfFile); //src\prac13\task08\file.txt
        if (!file.exists() || !file.canRead()) {
            System.out.println("File cannot be read");
            return;
        }
        InputStream inFile = new FileInputStream(file);


        byte[] bytes = new byte[(int)file.length()];
        inFile.read(bytes);

        //byte[] bytes = inFile.readAllBytes();// не работает на 32 разр


        String cat = new String(bytes);
        String[] words = cat.split("\\s");
        StringBuilder result = getLine(words);
        System.out.println(result);
    }
}
