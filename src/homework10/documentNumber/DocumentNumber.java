package homework10.documentNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дико извиняюсь за то, что реализовал не как статические, дочитал задание до конца
//только после его выполнения......................................................
public class DocumentNumber {
    //Массив, который является набором параметров каждого из блоков номера:
    //первое число - кол-во символов в блоке;
    //второе число - тип символов:
    //0 - цифры от 0 до 9;
    //1 - буквы английского алфавита:
    //2 - смешанные символы.
    private String[] line;
    private static String code = "UTF-8";
    private static int blocks[][] = {{4, 0}, {3, 1}, {4, 0}, {3, 1}, {4, 2}};
    private static String combination = "abc";
    private static String startCombo = "555";
    private static String endCombo = "1a2b";

    public DocumentNumber(String str) {
        this.line = str.split("-");
    }

    public void Print2NumBlocks() {
        System.out.println(line[0] + line[2]);
    }

    public void printSecureNum() {
        char[] spellingPhrase = String.join("-", line).toCharArray();
        for (int i = 0; i < spellingPhrase.length; i++) {
            if (isLetter(spellingPhrase[i])) {
                spellingPhrase[i] = '*';
            }
            System.out.print(spellingPhrase[i]);
        }
        System.out.println();
    }

    public void printLetters() {
        char[] spellingPhrase = String.join("-", line).toCharArray();
        boolean endOfLetterCombination = false;
        for (int i = 0; i < spellingPhrase.length; i++) {
            if (isLetter(spellingPhrase[i])) {
                System.out.print(spellingPhrase[i]);
                if (i < spellingPhrase.length - 1 && !isLetter(spellingPhrase[i + 1])) {
                    System.out.print("/");
                }
            }
        }
        System.out.println();
    }

    private boolean isLetter(char symbol) {
        if (symbol != '-' &&
                symbol != '1' &&
                symbol != '2' &&
                symbol != '3' &&
                symbol != '4' &&
                symbol != '5' &&
                symbol != '6' &&
                symbol != '7' &&
                symbol != '8' &&
                symbol != '9' &&
                symbol != '0') {
            return true;
        } else {
            return false;
        }
    }

    public void printLettersStringBuilder() {
        StringBuilder stringBuilderLine = new StringBuilder(String.join("-", line).toUpperCase());
        Pattern pattern = Pattern.compile("[A-Z]{1,3}");
        Matcher matcher = pattern.matcher(stringBuilderLine);
        System.out.print("Letters: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + "/");
        }
        System.out.println();
    }

    public boolean searchCombination() {
        String str = String.join("", line);
        return str.contains(combination);
    }

    public boolean searchComboInBegin() {
        String str = String.join("", line);
        return str.startsWith(startCombo);
    }

    public boolean searchComboInTheEnd() {
        String str = String.join("", line);
        return str.endsWith(endCombo);
    }
}
