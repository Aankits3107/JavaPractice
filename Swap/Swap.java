package Swap;

public class Swap {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Cola";
        String temp;
        
        temp = x;
        x = y;
        y = temp;

            System.out.println("X: " +x);
            System.out.println("Y: " +y);
    }
}

//Swap first 1,2. then 3,4. and print in reverse order.
// public class ArraySwap {
//     public static void main(String[] args) {
//         char[] arr = {'a', 'b', 'c', 'd'};
//         char temp;
        
//         // Swap b,a and c,d
//         temp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = temp;
//         temp = arr[2];
//         arr[2] = arr[3];
//         arr[3] = temp;
        
//         // Print result in reverse order
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }