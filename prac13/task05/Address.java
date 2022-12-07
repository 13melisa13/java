package prac13.task05;

import java.util.StringTokenizer;

public class Address {
    String country = "";
    String region = "";
    String city = "";
    String street = "";
    String house = "";
    String corpus = "";
    String flat = "";
    Address(String str){
        if (!str.contains(".")&&!str.contains(";")) {
            String[] address = str.split(",");
            if (address.length > 6) {
                country = address[0];
                region = address[1];
                city = address[2];
                street = address[3];
                house = address[4];
                corpus = address[5];
                flat = address[6];
            }
        }
        else {
            StringTokenizer tokenizer = new StringTokenizer(str,",;.");
            if (tokenizer.hasMoreTokens()){
                country = tokenizer.nextToken();
            }
            if (tokenizer.hasMoreTokens()){
                region = tokenizer.nextToken();
            }
            if (tokenizer.hasMoreTokens()){
                city = tokenizer.nextToken();
            }
            if (tokenizer.hasMoreTokens()){
                street = tokenizer.nextToken();
            }
            if (tokenizer.hasMoreTokens()){
                house = tokenizer.nextToken();
            }
            if (tokenizer.hasMoreTokens()){
                corpus = tokenizer.nextToken();
            }
            if (tokenizer.hasMoreTokens()){
                flat = tokenizer.nextToken();
            }
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
