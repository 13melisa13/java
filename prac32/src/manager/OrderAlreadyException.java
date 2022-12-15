package manager;

public class OrderAlreadyException extends Exception {
    public OrderAlreadyException(String ex){
        super("Order is already added at " + ex );
    }
}

