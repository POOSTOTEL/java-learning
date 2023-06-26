package lesson6;

public class CharacterArray {
    static int length = 128;
    public static void main(String[] args) {
        int length = 128;
        changeLength(length);
        char [] array = new char[128];
        array = fillMass(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " number is: " + " '" + array[i] + "' character");
        }
    }
    public static int changeLength (int length1) {
       return length1 /= 2;
    }
    public static char[] fillMass(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) i;
        }
        return array;
    }
}
