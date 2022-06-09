package ss3_Array.thuc_hanh;

import java.util.Arrays;

public class Test {
    public static void ham(int[] x){
        x= new int[]{123,123,123};
    }
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (j == (6 - i) || j == (5 + i)) {
//                    System.out.print(i);
//                }
//                System.out.println();
//            }
//        }
        int[] a = {1,2,3,4,5,6,7};
        int[] b = new int[4];
        System.arraycopy(a,2, b,1,2);
        System.out.println(Arrays.toString(b));
}
}
