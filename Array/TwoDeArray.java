// An array of array.
// Aarray with rows and columns.

package Array;

public class TwoDeArray {
    public static void main(String[] args) {
        //can be defined in two ways. 1.
        // String[][] cars = new String[3][3];
        //     cars[0][0] = "Camero";
        //     cars[0][1] = "Corvette";
        //     cars[0][2] = "Silverado";

        //     cars[1][0] = "Mustang";
        //     cars[1][1] = "Tesla";
        //     cars[1][2] = "Dodge";

        //     cars[2][0] = "BMW";
        //     cars[2][1] = "Audi";
        //     cars[2][2] = "Mercedes";

        // 2.
        String[][] cars = {
                            {"Camero", "Corvette", "Silverado"},
                            {"Mustang", "Tesla", "Dodge"},
                            {"BMW", "Audi", "Mercedes"}
                        };

            for(int i = 0; i < cars.length; i++) { //outter for loop - rows
                    System.out.println();
                for(int j = 0; j < cars[i].length; j++) { //inner for loop - columns. continue this inner for loop as long column length is less than the length of row we are currently on
                        System.out.print(cars[i][j] + " "); //best to use 'print' in the inner loop, instead of 'println'
                }
            }
    }
}
