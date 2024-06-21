package week_12.lab_session.workingwithnumbers;

public class Config {

    // Given the following int[] numbers = { 10, 30, 50, 60, 1900, 2500, 1901, 250 };
    // 1: Find the sum of the even numbers
    // 2: Find the sum of the odd numbers
    // 3: Find the sum of both even and odd numbers
    // 4: Expected Out:
    // Sum of even numbers: X
    // Sum of odd numbers: Y
    // Total: Z
    // NOTE: to design a class and use method.
    private int[] array;
    private double sumOfEvenNumbers;
    private double sumOfOddNumbers;

    // Constructor
    public Config( int[] array ) {
        setArray(array);
        setSumOfEvenNumbers( calculateSumOfEvenNumbers() );
        setSumOfOddNumbers( calculateSumOfOddNumbers() );
    }

    // Getters
    private int[] getArray() {return array;}
    private double getSumOfOddNumbers() {return sumOfOddNumbers;}
    private double getSumOfEvenNumbers() {return sumOfEvenNumbers;}

    // Setters
    private void setArray(int[] array) {this.array = array;}
    private void setSumOfEvenNumbers(double sumOfEvenNumbers) {this.sumOfEvenNumbers = sumOfEvenNumbers;}
    private void setSumOfOddNumbers(double sumOfOddNumbers) {this.sumOfOddNumbers = sumOfOddNumbers;}

    // Method to calculate the sum of even numbers
    private double calculateSumOfEvenNumbers() {
        for ( int number : getArray() ) if ( number % 2 == 0 ) setSumOfEvenNumbers( sumOfEvenNumbers += number);
        return getSumOfEvenNumbers();
    }

    // Method to calculate the sum of odd numbers
    private double calculateSumOfOddNumbers() {
        for ( int number : getArray() ) if ( number % 2 != 0 ) setSumOfOddNumbers( sumOfOddNumbers += number);
        return getSumOfOddNumbers();
    }

    /** Method to calculate the sum of both even and odd numbers
    * @return double value which is the calculated sum of both even and odd numbers
     */
    private double calculateSumOfEvenAndOddNumbers() {
        return getSumOfEvenNumbers() + getSumOfOddNumbers();
    }

    // Sum of even numbers: X
    // Sum of odd numbers: Y
    // Total: Z

    // Method to print the result of the calculation
    public void printResult() {
        System.out.println("Sum of even numbers: " + getSumOfEvenNumbers());
        System.out.println("Sum of odd numbers: " + getSumOfOddNumbers());
        System.out.println("Total: " + calculateSumOfEvenAndOddNumbers() );
    }

}
