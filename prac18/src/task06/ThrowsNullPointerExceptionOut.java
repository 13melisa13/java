package task06;

public class ThrowsNullPointerExceptionOut {
    public void printMessage(String key) {
        String message = "";
        try {
            message = getDetails(key);
        } catch (NullPointerException nullPointerException){
            message = nullPointerException.getMessage();
        } finally {
            System.out.println(message);
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
       ThrowsNullPointerExceptionOut tnpe = new ThrowsNullPointerExceptionOut();
       tnpe.printMessage("null");
       tnpe.printMessage(null);
    }
}
