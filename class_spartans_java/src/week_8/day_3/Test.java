package week_8.day_3;

public class Test {

    public static void main(String[] args) {
//        String[][] studentNmaes = {
//                {"a","b","c", "d"},
//                {"e","f","g"},
//                {"h","i","j"}
//        };

        for (int row = 0; row < 3; row++) {
            //System.out.println("row ["+ row + "]");

            for (int col = 0; col < 3; col++) {
                System.out.println("row [" + row + "] column [" + col + "]");
            }
            System.out.println();
        }
    }
}
