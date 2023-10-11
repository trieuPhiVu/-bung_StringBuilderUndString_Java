public class StringAufgabe {
    public static String reverseString(String input) {
        if (input == null || input.length() == 1) {
            return input;
        } else {
            char letzteChar = input.charAt(input.length() - 1);
            String restString = input.substring(0, input.length() - 1);
            return letzteChar + reverseString(restString);
        }
    }


    public static Boolean isPalindrome(String input) {
        input = input.toUpperCase();
        return (input.equals(reverseString(input))) ? true : false;
    }
}