package task01;

import java.util.Arrays;

public class ArrayHolder <E> {
    private E [] array;
    public ArrayHolder(E [] array){
        this.array =  array;
    }

    public E getArrayIndex(int i)throws ArrayIndexOutOfBoundsException{
        if (i >= 0 && i < array.length)
            return  array[i];
        else
            throw new ArrayIndexOutOfBoundsException("Index: "+ (Integer)i
            + ", Size: " + (Integer)array.length);
    }

    public void setArray( E [] array){
        this.array =  array;
    }

    public int getLength(){
        return  array.length ;
    }

    @Override
    public String toString() {
        return "ArrayHolder{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
