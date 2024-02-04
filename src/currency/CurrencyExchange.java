package currency;

public class CurrencyExchange {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(38);
        Euro euro = new Euro(41);
        Som som = new Som(0.001);

        ListOfCurrency.addCurrency(dollar);
        ListOfCurrency.addCurrency(euro);
        ListOfCurrency.addCurrency(som);

        final int EXIT_NUMBER = 100;
        int currencyNumber;
        Currency workingCurrency;

        do {
            MenuCurrency.printCurrencyMenu();
            currencyNumber = MenuCurrency.getNumberFromConsole();
            if (currencyNumber == 0) {
                System.out.println("Wrong choice. Try again.");
                continue;
            } else if (currencyNumber != 100) {
                workingCurrency = MenuCurrency.setCurrency(currencyNumber);
//                System.out.println("Working currency is: " + workingCurrency.getCurrencyName()
//                        + " kurs NBU = " + workingCurrency.getKursNbu());
//                // System.out.println("Was entered " +currencyNumber);
                boolean stayInActionsMenu;
                do {
                    MenuActions.printActionsMenu(workingCurrency);
                    int menuNumber = MenuActions.getNumberFromConsole();
                    stayInActionsMenu = (menuNumber != EXIT_NUMBER);
                    if (stayInActionsMenu) {
//                        System.out.println("Action number = " + menuNumber );
                        MenuActions.doActionsWithCurrency(workingCurrency, menuNumber);
                    }

                }while (stayInActionsMenu);


            }
        } while (currencyNumber != EXIT_NUMBER);

        System.out.println("Goodbye!");
    }
}
