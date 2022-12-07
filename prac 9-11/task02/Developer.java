package task02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Developer {
    String surname;
    Date firstDate;
    Date lastDate= new Date();
    Developer(String surname,Date firstDate){
        this.firstDate=firstDate;
        this.surname=surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        return "Developer{" +
                "surname='" + surname + '\'' +
                ", firstDate = " + dateFormat.format(firstDate)+
                ", lastDate = " + dateFormat.format(lastDate)+
                '}';
    }
}
