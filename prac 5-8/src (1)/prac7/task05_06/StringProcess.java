package prac7.task05_06;

public class StringProcess implements StringProcessable{
    String str;
    public StringProcess(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return  str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public StringProcessable reverse() {
        return new StringProcess(new StringBuilder(str).reverse().toString());
    }

    @Override
    public StringProcessable change() {
        for(int i = 0; i < length() - 1; i += 2){
            str = str.substring(0,1+i) + ' ' + str.substring(i+1);
        }
        return this;
    }
}
