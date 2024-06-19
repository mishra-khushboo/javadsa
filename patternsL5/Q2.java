// package patternsL9;

// public class HollowRectangle {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++) {
//             if (i == 1 || i == 4) {
//                 for (int j = 1; j <= 5; j++) {
//                     System.out.print("*");
//                 }
//             } else {
//                 for (int k = 1; k <= 5; k++) {
//                     if (k == 1 || k == 5) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }

// OR

package patternsL5;

public class Q2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int k = 1; k <= 5; k++) {
                if (k == 1 || k == 5 || i == 1 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
    }
}
