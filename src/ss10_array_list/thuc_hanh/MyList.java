package ss10_array_list.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
      elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++]= e;
    }
    public E get(int i){
        if (i>=size|| i<0){
            throw new IndexOutOfBoundsException("Index:" + i + "Size " + i);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(4);
        myList.add(5);
        System.out.println( myList.get(3));
    }
}

