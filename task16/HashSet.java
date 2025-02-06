import java.util.LinkedList;
import java.util.List;

public class HashSet<T> implements Set<T> {
    private List<T>[] table;
    private int size;
    private static final double THRESHOLD = 0.75;
    
    public HashSet(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "capacity must be a positive, non-zero value! Provided: " + capacity);
        }

        @SuppressWarnings("unchecked") // for this declaration only
        List<T>[] t = new LinkedList[capacity];
        
        table = t;
        this.size = 0;
    }

    public boolean add(T elem) {
        int index = hashCode(elem, table.length);

        // if ((double) size / table.length >= THRESHOLD) {
        //     System.out.println("Have to resize!");
        //     resize();
        //     index = hashCode(elem, table.length); // Recalculate index after resizing
        // }

        if(table[index] == null){
            table[index] = new LinkedList<>();
        }

        if (!table[index].contains(elem)){
            table[index].add(elem);
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(T elem) {
        int index = hashCode(elem, table.length);
        if(table[index] == null){
            return false; //Nothing to remove
        }
        if(table[index].contains(elem)){
            table[index].remove(elem);
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(T elem) {
        int index = hashCode(elem, table.length);
        if (table[index] == null) {
            return false;
        }
        return table[index].contains(elem); //Using List's contains method
    }

    public int size() {
        return size;
    }

    public int hashCode(T elem, int capacity){
        return (elem.hashCode() & 0x7FFFFFFF) % capacity; 
    }
    
