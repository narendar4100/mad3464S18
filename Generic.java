/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author hp
 */
public class Generic {
    //generic method printArray
/**
 * printing list of elements 
 * @param <E> Indicate the generic type
 * @param inputArray List of elements to be printed
 * @return no return value
 */
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%S", element);
        }
        System.out.println();
    }
    //
    /**
     * 
     * @param <T> Generic type
     * @param x first value
     * @param y Second value
     * @param z third value
     * @return returns max of three elements
     */

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;

        }
        return max;

    }
    //
    /**
     * 
     * @param args command line arguments
     * @return returns nothing
     */

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer value :%d\n", integerBox.get());

        Box<String> StringBox = new Box<String>();
        StringBox.set(new String("Hello world"));
        System.out.printf("String value :%s\n\n", StringBox.get());

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Array integerArray contains:");
        printArray(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);

        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("\n Array characterArray contains:");
        printArray(charArray);
        
        System.out.printf("max of %d, %d and %d is %d\n\n",3, 4,5, maximum(3,4,5));
        System.out.printf("max of %.1f ,%.1f and %.1f is %.1f\n\n", 6.6,8.8,7.7,maximum(6.6,8.8,7.7));
        System.out.printf("max of %s ,%s and %s is %s\n\n","near","apple","orange",maximum("near","apple","orange"));
    }
}

    
