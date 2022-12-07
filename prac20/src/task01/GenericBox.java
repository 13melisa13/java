package task01;

import java.io.Serializable;

public class GenericBox <T extends Comparable, V extends  Animal & Serializable, K extends Number>{
    private T t;
    private V v;
    private K k;
    public GenericBox(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "t=" + t + " (" + t.getClass() + ") " +
                ", v=" + v + " (" + v.getClass() + ") " +
                ", k=" + k + " (" + k.getClass() + ") " +
                '}';
    }
}
