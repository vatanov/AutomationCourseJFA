package currency;

public class MainClassCurrency {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(28.2);
        System.out.println(dollar.getKursNbu());
        dollar.setKursNbu(29.0);
        System.out.println(dollar.getKursNbu());
        System.out.println(dollar.getMarga());
    }
}
