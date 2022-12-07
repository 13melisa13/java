package task02;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату получения задания \"<yyyy><MM><dd>\":");
        String dateString = in.nextLine();
        System.out.println("Введите дату получения задания \"<hh><mm>\":");
        dateString += in.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmm");
        try {
            Date date = formatter.parse(dateString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
            System.out.println(dateFormat.format(calendar.getTime()));
            Developer developer = new Developer("Isaeva", date);
            if (date.before(new Date())){
                System.out.println("Задание уже получено");
            }
            else {
                System.out.println("Задание еще не получено");
            }
            System.out.println(developer);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
