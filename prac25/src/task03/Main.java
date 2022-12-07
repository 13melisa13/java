package task03;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String ipPattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String[] ips = {"127.0.0.1", "255.255.255.0", "1307.6.7.1",
                "adc.qwe.dfh.dfg", "256.6.7.1", "123.234."};
        for (String ip: ips) {
            if (Pattern.matches(ipPattern,ip)){
                System.out.println(ip);
            }
        }
    }
}
