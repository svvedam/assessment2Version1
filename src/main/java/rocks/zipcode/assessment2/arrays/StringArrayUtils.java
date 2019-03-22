package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        //short way
        //return Arrays.copyOfRange(arrayToBeSpliced, startingIndex, endingIndex);

        //long way
        //if startingIndex or endingIndex is less than 0, then throw IllegalArgumentException
        if (startingIndex < 0 || endingIndex < 0) {
            throw new IllegalArgumentException();
        }

        //need to create a new array with the subarray length
        int newLength = endingIndex - startingIndex;
        String[] newArray = new String[newLength];

        int newArrayIndex = 0; //variable to keep track of where to add to the new array

        //go through each element to copy over
        //i is the index for the arrayToBeSpliced
        for (int i = startingIndex; i < endingIndex; i++) {
            //copy the old value to the new array
            newArray[newArrayIndex] = arrayToBeSpliced[i];
            newArrayIndex++;
        }
        return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        // short way
        // return Arrays.copyOfRange(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);

        //look at the method above to see details comments

        //check to see if the index are valid
        if (startingIndex < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (startingIndex >= arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        }

        int newLength = arrayToBeSpliced.length - startingIndex;
        String[] newArray = new String[newLength];

        int newArrayIndex = 0;

        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            //copy the old value to the new array
            newArray[newArrayIndex] = arrayToBeSpliced[i];
            newArrayIndex++;
        }
        return newArray;

    }
}
