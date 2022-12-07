package prac13.task07;

public class Phone {
    StringBuilder numberOfPhone;
    Phone(String phone){
        StringBuilder number, code;
        if (phone.charAt(0) == '8'){
            number = new StringBuilder(phone.substring(1,phone.length()));
            code = new StringBuilder("7");
        }
        else {
            number = new StringBuilder(phone.substring(phone.length()-10,phone.length()));
            code = new StringBuilder(phone.substring(1,phone.length()-10));
        }
        numberOfPhone = new StringBuilder();
        number.insert(3,'-');
        number.insert(7,'-');
        numberOfPhone.append('+').append(code).append(number);
    }

    @Override
    public String toString() {
        return "Phone{ " +
                "numberOfPhone = " + numberOfPhone + " }";
    }
}
