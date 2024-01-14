package currency;

public class MenuCurrency extends Menu{
    public static void printCurrencyMenu() {
        System.out.println("");
        System.out.println("Choose currency");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Uz Som");
        System.out.println("100. Exit");
        System.out.println("Enter your choice:");
    }

    public static Currency setCurrency(int numberOfCurrency) {
        Currency tempCurrency = null;
        switch (numberOfCurrency) {
            case 1:
                //System.out.println("Dollar");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
                break;
            case 2:
                //System.out.println("Euro");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("EUR");
                break;
            case 3:
                //System.out.println("Som");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Som");
                break;
            default:
                System.out.println("Dollar is selected by default");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
        }
        return tempCurrency;
    }
}
