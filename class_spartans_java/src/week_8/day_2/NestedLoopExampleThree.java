package week_8.day_2;

public class NestedLoopExampleThree {

    // How many combination do we have from 1 to 3

    // 11
    // 12
    // 13
    // 21
    // 22
    // 23

    public static void main(String[] args) {

        int numberOfCombination = 0;

        for (int i = 1; i <= 3; i++ ) { // OuterLoop
            for (int j = 1; j <= 3; j++) {  // InnerLoop
                System.out.println( i + " " + j );
                numberOfCombination++;
            }
        }
        System.out.println("There are " + numberOfCombination + " number of combinations!");
    }
}
