package ss3_Array.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == (6 - i) || j == (5 + i)) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
