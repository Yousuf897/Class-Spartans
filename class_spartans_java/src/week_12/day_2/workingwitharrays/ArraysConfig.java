package week_12.day_2.workingwitharrays;

import java.util.Arrays;

public class ArraysConfig {

    private int[] array;
    private int[][] TwoDArray;
    private int maximumNumber;
    private int minimumNumber;
    private int[][] matrixOne;
    private int[][] matrixTwo;
    private int[][] resultMatrix;

    // Constructor
    public ArraysConfig( int[] array ) {
        setArray(array);
        setMaximumNumber(getArray()[0]);
        setMinimumNumber(getArray()[0]);
        sortOneDimensionArrayOfInt();
    }

    // Second Constructor
    public ArraysConfig( int[][] TwoDArray ) {
        setTwoDArray(TwoDArray);
    }

    // Third Constructor
    public ArraysConfig( int[][] matrixOne, int[][] matrixTwo ) {
        setMatrixOne(matrixOne);
        setMatrixTwo(matrixTwo);
        this.resultMatrix = new int[2][2];
        multiplyMatrixElements();
    }

    // Getters
    private int[] getArray() {return array;}
    private int[][] getTwoDArray() {return TwoDArray;}
    private int getMaximumNumber() {return maximumNumber;}
    private int getMinimumNumber() {return minimumNumber;}
    private int[][] getMatrixOne() {return matrixOne;}
    private int[][] getMatrixTwo() {return matrixTwo;}
    private int[][] getResultMatrix() {return resultMatrix;}

    // Setters
    private void setArray(int[] array) {this.array = array;}
    private void setTwoDArray(int[][] twoDArray) {TwoDArray = twoDArray;}
    private void setMaximumNumber(int maximumNumber) {this.maximumNumber = maximumNumber;}
    private void setMinimumNumber(int minimumNumber) {this.minimumNumber = minimumNumber;}
    private void setMatrixOne(int[][] matrixOne) {this.matrixOne = matrixOne;}
    private void setMatrixTwo(int[][] matrixTwo) {this.matrixTwo = matrixTwo;}

    // Method to find the maximum number in one dimension array
    private int findMaximumNumberInOneDimensionArray() {
        for ( int number : getArray() ) if ( number > getMaximumNumber() ) setMaximumNumber(number);
        return getMaximumNumber();
    }

    // Method to find the minimum number in one dimension array
    private int findMinimumNumberInOneDimensionArray() {
        for ( int number : getArray() ) if ( number < getMinimumNumber() ) setMinimumNumber(number);
        return getMinimumNumber();
    }

    // Method to sort the elements of an array using Bubble sort algorithm
    private void sortOneDimensionArrayOfInt() {
        for ( int i = 0; i < getArray().length; i++ ) {
            for ( int j = 0; j < getArray().length - i - 1; j++ ) {
                if ( getArray()[j] > getArray()[j + 1] ) {
                    int temp = getArray()[j];
                    getArray()[j] = getArray()[j + 1];
                    getArray()[j + 1] = temp;
                }
            }
        }
    }

    // Method to multiply the elements of two dimension array
    private void multiplyMatrixElements() {
        for ( int row = 0; row < 2; row++ ) {
            for ( int col = 0; col < 2; col++ ) {
               getResultMatrix()[row][col] = getMatrixOne()[row][col] * getMatrixTwo()[row][col];
            }
        }
    }

    // Public method to print the elements of one dimension array
    public void printIntElementsOfOneDimensionArray() {
        System.out.println(Arrays.toString(getArray()) );
       // for ( int index = 0; index < getArray().length; index++ ) System.out.print( getArray()[index] + " " );
    }

    public void printIntElementsOfTwoDimensionArray() {
        System.out.println(" * * * * * Elements of Two Dimension Array * * * * * ");
        for ( int row = 0; row < getTwoDArray().length; row++ ) {
            for ( int col = 0; col < getTwoDArray()[row].length; col++ ) {
                System.out.print( getTwoDArray()[row][col] + " " );
            }
            System.out.println();
        }
    }

    // Method to print the maximum number
    public void printMaximumNumberFoundInOneDimensionArray() {
        System.out.println("Maximum Number is: " + findMaximumNumberInOneDimensionArray() );
    }

    // Method to print the minimum number
    public void printMinimumNumberFoundInOneDimensionArray() {
        System.out.println("Minimum Number is: " + findMinimumNumberInOneDimensionArray() );
    }

    // Method to print second smallest number in one dimension array of int
    public void printSecondSmallestNumberInOneDimensionArray() {
        System.out.println("Second smallest number: " + getArray()[1] );
    }

    public void printSecondLargestNumberInOneDimensionArray() {
        System.out.println("Second largest number: " + getArray()[getArray().length - 2] );
    }

    // Public method to print the elements of one dimension array
    public void printElementsOfResultMatrix() {
        System.out.println("Result of multiplied matrix is : ");
         for ( int row = 0; row < getResultMatrix().length; row++ ) {
             for ( int col = 0; col < getResultMatrix()[row].length; col++ ) {
                 System.out.print( getResultMatrix()[row][col] + " " );
             }
             System.out.println();
         }
    }

}
