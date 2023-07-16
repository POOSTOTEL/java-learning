package homework10.palindrome;

public abstract class Palindrome {
    public static void checkPalindrome(String str, int number) {
        String words[] = str.trim().replace(",", "").replace(".", "").toLowerCase().split(" ");
        int i = number - 1;
        char[] experimentalWord = words[i].toCharArray();
        boolean isPalindrome = true;
        for (int j = 0; j < experimentalWord.length / 2; j++) {
            if (experimentalWord[j] != experimentalWord[experimentalWord.length - j - 1]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Слово №" + number + " - палиндром: " + isPalindrome);
    }
}
