package patternsL5;

public class Q9 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                num = 0;
            } else
                num = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                if (num == 1) {
                    num = 0;
                } else
                    num = 1;
            }
            System.out.println("");
        }
    }

}
