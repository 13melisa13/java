package manager;

import orders.Order;

import java.io.Serializable;
import java.util.HashMap;

public class OrderManager implements Serializable {
    private static final long serialVersionUID = 1L;
    HashMap<Integer, Object> orderHashMap = new HashMap<>();
    HashMap<String, Object> orderHashMap1 = new HashMap<>();

    public void add(Order o, Integer table) throws OrderAlreadyException{
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table.toString());
        else orderHashMap.put(table, o);
    }
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }


    public void removeOrder(int table){
        orderHashMap.remove(table);
    }


    public void add(Order o, String address) throws OrderAlreadyException {
        if (orderHashMap1.containsKey(address))
            throw new OrderAlreadyException(address);
        else orderHashMap1.put(address, o);
    }
    public Object getOrder(String address){
        return orderHashMap1.get(address);
    }
    public void removeOrderInternet(String address){
        orderHashMap1.remove(address);
    }
    public HashMap getInternetOrder(){
        return orderHashMap1;
    }
    public HashMap getRestaurantOrder(){
        return orderHashMap;
    }
}
