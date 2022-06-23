package ss11_search.bai_tap;


import java.util.LinkedList;
import java.util.Scanner;

public class StringAscending {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap chuoi");
        String str = scanner.nextLine();
        LinkedList<Character> listmax = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > listmax.size()) {
                listmax.clear();
                listmax.addAll(list);
            }
        }
        for (Character c : listmax
        ) {
            System.out.print(c);

        }
    }
}
