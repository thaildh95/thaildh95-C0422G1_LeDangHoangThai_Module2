package ss10_array_list.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Mylist2<E> {
    Scanner scanner = new Scanner(System.in);
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    public Object elements[];


    public Mylist2() {
      elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);

    }
    private  void add (E element,int index){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
        index = size;
    }
    private  void remove(int index){
        System.out.println("nhap vi tri can xoa");
        for (int i = elements.length-1; i >0; i--) {
            elements[i]=elements[i-1];
            if (index == i){
                elements[i]=null;
            }
        }
    }
}
