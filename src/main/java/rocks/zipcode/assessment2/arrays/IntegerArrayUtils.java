package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        //create a new array with the same length + 1
        //copy all the values from integerArray
        int newLength = integerArray.length + 1;
        Integer[] newArray = Arrays.copyOf(integerArray, newLength);

        //add the valueToBeAdded to the last position of the array
        newArray[newLength - 1] = valueToBeAdded;

        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        //replace the value at indexToInsertAt with valueToBeInserted
        integerArray[indexToInsertAt] = valueToBeInserted;

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        //go through each value in the array
        for (int i = 0; i < integerArray.length; i++) {
            //if the value is even
            if (integerArray[i] % 2 == 0) {
                //update the value to value + 1
                integerArray[i] = integerArray[i] + 1;
            } else {
                //else the value is odd
                //update the value to value - 1
                integerArray[i] = integerArray[i] - 1;
            }
        }

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        //go through each value in the array
        for (int i = 0; i < integerArray.length; i++) {
            //if the value is even
            if (integerArray[i] % 2 == 0) {
                //update the value to value + 1
                integerArray[i] = integerArray[i] + 1;
            }
        }

        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {

        //go through each value in the array
        for (int i = 0; i < input.length; i++) {
            //if the value is odd
            if (input[i] % 2 == 1) {
                //update the value to value - 1
                input[i] = input[i] - 1;
            }
        }

        return input;
    }
}
