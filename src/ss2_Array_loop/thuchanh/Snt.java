package ss2_Array_loop.thuchanh;

public class Snt {
    public static void main(String[] args) {
        int count = 0;
        int uoc = 0;
        int i = 2;
        while (count!=20){
            for (int j = 2; j <i ; i++) {
                if (i%j==0){
                    uoc++;
                    break;
                }if (uoc==0){
                    count++;
                    System.out.println(i);
                }

            }uoc=0;
            i++;
        }
    }
}
