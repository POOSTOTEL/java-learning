package homework14.enumWithCloseSizes;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        System.out.println("Get size:");
        System.out.println("XXS XS S M L");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        switch (line) {
            case "XXS" ->
                    System.out.println(Size.XXS.ordinal() + " " + Size.XXS.getEuroSize() + " " + Size.XXS.getDescription());
            case "XS" ->
                    System.out.println(Size.XS.ordinal() + " " + Size.XS.getEuroSize() + " " + Size.XS.getDescription());
            case "S" ->
                    System.out.println(Size.S.ordinal() + " " + Size.S.getEuroSize() + " " + Size.S.getDescription());
            case "M" ->
                    System.out.println(Size.M.ordinal() + " " + Size.M.getEuroSize() + " " + Size.M.getDescription());
            case "L" ->
                    System.out.println(Size.L.ordinal() + " " + Size.L.getEuroSize() + " " + Size.L.getDescription());
        }
    }
}
