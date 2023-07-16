package lesson10;

import java.util.Arrays;

public class WorkWithStringType {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "world! You ";
        String str3 = "are beautiful!";
        System.out.println(str1 + str2 + str3);
        System.out.println(str1.concat(str2).concat(str3));
        System.out.println(String.join("////", str1, str2, str3));
        String str4 = "Hello ";
        String str5 = "HELLO ";
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str5));
        System.out.println(str3.substring(2));
        System.out.println(str3.length());
        System.out.println(str3.indexOf("beaut"));
        boolean flag = true;
        System.out.println(String.valueOf(flag));
        System.out.println(str3.toUpperCase());
        String str6 = "12.09.2004 - date of Birth!!";
        System.out.println(str6.replace(".", "//"));
        String str7 = "    Richard   \n\r";
        System.out.println(str7.trim());
        String str8 = "    ";
        System.out.println(str8.isEmpty());
        System.out.println(str8.isBlank());
        String[] words = str6.split(" ");
        System.out.println(Arrays.toString(words));


    }
}
