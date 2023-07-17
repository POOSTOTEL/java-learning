package homework10.stringMethods;

public abstract class StringMethods {
    private static String keyWord = "Java";
    private static char oldLetter = 'a';
    private static char newLetter = 'o';
    private static String startSubstring = "I like";
    private static String endSubstring = "!!!";

    public static void printLastChar(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static boolean checkEndOfWord(String str) {
        return str.endsWith(endSubstring);
    }

    public static boolean checkTheBeginningOfWord(String str) {
        return str.startsWith(startSubstring);
    }

    public static boolean checkIfStringContains(String str) {
        return str.contains(keyWord);
    }

    public static int searchPositionSubstring(String str) {
        return str.indexOf(keyWord);
    }

    public static String replaceLetters(String str) {
        return str.replace(oldLetter, newLetter);
    }

    public static String makeUppercaseLetters(String str) {
        return str.toUpperCase();
    }

    public static String makeLowercaseLetters(String str) {
        return str.toLowerCase();
    }

    public static String cutSubstring(String str) {
        return str.substring(str.indexOf(keyWord), keyWord.length() + str.indexOf(keyWord));
    }
}
