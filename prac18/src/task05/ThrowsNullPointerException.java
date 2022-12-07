package task05;

public class ThrowsNullPointerException {
    String details = "";
    public  void setDetails(String key) {
        if(key == null) {
            try{
                throw new NullPointerException("null key in getDetails" );
            } catch (NullPointerException nullPointerException){
                System.out.println("null key in getDetails");
            }
        }
        details = key;
    }

    public static void main(String[] args) {
       ThrowsNullPointerException tnpe = new ThrowsNullPointerException();
       tnpe.setDetails(null);
    }
}
