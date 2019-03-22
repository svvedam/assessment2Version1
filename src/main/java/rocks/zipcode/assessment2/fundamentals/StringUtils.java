package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        //short way
//        String format = "%" + amountOfPadding + "s";
//        return String.format(format, stringToBePadded);

        //long way
        int amountOfSpaces = amountOfPadding - stringToBePadded.length();
        String spaces = repeatString(" ", amountOfSpaces);
        return  spaces + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        //short way
//        String format = "%-" + amountOfPadding + "s";
//        return String.format(format, stringToBePadded);

        //long way
        int amountOfSpaces = amountOfPadding - stringToBePadded.length();
        String spaces = repeatString(" ", amountOfSpaces);
        return stringToBePadded + spaces;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            result += stringToBeRepeated;
        }

        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        //short way using regex (you will learn this later)
        //return string.matches("[a-zA-z ]+");

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(!(Character.isLetter(c) || c == ' ')) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
//        short way
//        return string.matches("[0-9]+");

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        //short way
        //return string.matches(".*[&*{}()]+.*");

//        long way
        String specialCharacters = "&*{}()";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            String strChar = Character.toString(c);
            if(specialCharacters.contains(strChar)) {
                return true;
            }
        }

        return false;
    }
}
