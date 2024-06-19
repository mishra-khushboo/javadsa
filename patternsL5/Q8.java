package patternsL5;

public class Q8 {
    public static void main(String[] args) {

        int k = 0;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                k = k + 1;
                System.out.print(k + " ");
            }
            System.out.println("");

        }
    }

}
