package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget");
        String szoveg = sc.nextLine();
        String menuPont = "";
        while (!menuPont.equals("f")){
            System.out.println("Kérem adja meg mit szeretne elvégezni a szöveggel:");
            System.out.println("\ta- Nagy betűsé alakítani");
            System.out.println("\tb- Kis betűsé alakítani");
            System.out.println("\tc- Lekérdezni a hosszát");
            System.out.println("\td- Összehasonlítnai egy másik szöveggel:");
            System.out.println("\te- Egy részét kiíratni a szövegnek");
            System.out.println("\tf- Kilépni");
            System.out.print("Kérem adja meg az elvégezendő művelet betűjelét");
            menuPont = sc.nextLine().toLowerCase();
        }
    }
}
