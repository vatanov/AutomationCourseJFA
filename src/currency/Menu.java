package currency;

import java.util.Scanner;

public class Menu {
    public static int getNumberFromConsole() {
        Scanner keyboard = new Scanner(System.in);
        try {
            return keyboard.nextInt();
        } catch (Exception e) {
            return 0;
        }

    }
}
