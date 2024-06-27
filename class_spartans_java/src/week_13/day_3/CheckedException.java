package week_13.day_3;

public class CheckedException {

    public static void main(String[] args) throws InterruptedException {

        printNumbersFromOneToTen();

    }

    public static void printNumbersFromOneToTen() throws InterruptedException {
        for ( int number = 1; number <= 10; number++ ) {
            Thread.sleep(1000);
            System.out.print(number + " ");
        }
    }

}
