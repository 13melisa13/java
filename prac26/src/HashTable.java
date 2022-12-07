import java.util.Arrays;

public class HashTable {
    public class HashElem{
        String value;
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return  value;
        }
    }
    HashElem[] table = new HashElem[11];
    public int hash(HashElem obj){
        int hash = 0;
        for (int i = 0; i < obj.getValue().length(); i++) {
            hash += obj.getValue().charAt(i);
        }
        return hash % 11;
    }

    public String getElem(int index) {
        if (index >= 0 && index < table.length)
           return table[index].getValue();
        else
            return "NOT FOUND";
    }

    public boolean add(String value){
        HashElem elem = new HashElem();
        elem.setValue(value);
        if (table[hash(elem)] == null){
            table[hash(elem)] = elem;
            return true;
        } else {
            return false;
        }
    }
    public int find(String value){
        HashElem elem = new HashElem();
        elem.setValue(value);
        //System.out.println(value + " " + hash(elem));
        if ( table[hash(elem)]
                != null && table[hash(elem)].getValue().equals(elem.getValue())){
            return hash(elem);
        } else {
            return -1;
        }
    }
    public boolean delete(String value){
        if (find(value) != -1){
            table[find(value)] = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(table);
    }
}
