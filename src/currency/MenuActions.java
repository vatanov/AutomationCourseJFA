package currency;

public class MenuActions extends Menu {
    public static void printActionsMenu(Currency workingCurrency) {
        System.out.println();
        System.out.println("Choose action for " + workingCurrency.getCurrencyName() + " : ");
        System.out.println("1 : Change Currency to Grn ");
        System.out.println("2 : Change Grn to Currency ");
        System.out.println("3 : Change kurs NBU ");
        System.out.println("4 : Show kurs NBU ");
        System.out.println("100: Exit from menu");
        System.out.println("Your choice : ");
    }

    public static void doActionsWithCurrency(Currency workingCurrency, int menuNumber) {
        switch (menuNumber) {
            case 1:
                System.out.println("Enter number of currency " + workingCurrency.getCurrencyName() + ":");
                double numberOfCurrency = getDoubleFromConsole();
                workingCurrency.exchangeCurrencyToGrn(numberOfCurrency);
                break;
            case 2:
                System.out.println("Enter number of GRN: ");
                workingCurrency.exchangeGrnToCurrency(getDoubleFromConsole());
                break;
            case 3:
                System.out.println("Enter new kurs NBU for currency " + workingCurrency.getCurrencyName());
                workingCurrency.setKursNbu(getDoubleFromConsole());
                break;
            case 4:
                System.out.println(
                        String.format("Kurs NBU for %s is %s"
                                , workingCurrency.getCurrencyName()
                                , workingCurrency.getKursNbu())
                );
                break;
            default:
                System.out.println("No actions with number " + menuNumber);
        }
    }
}