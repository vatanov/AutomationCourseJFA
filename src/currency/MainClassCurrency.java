package currency;

public class MainClassCurrency {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(28.2);
        System.out.println(dollar.getKursNbu());
        dollar.setKursNbu(29.0);
        System.out.println(dollar.getKursNbu());
        System.out.println(dollar.getMarga());

        dollar.exchangeGrnToCurrency(3000);
        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(41);
        euro.exchangeCurrencyToGrn(100);

        Som som = new Som(0.001);
        som.exchangeGrnToCurrency(100);

        Bitcoin bitcoin = new Bitcoin(5000);
        bitcoin.exchangeCurrencyToGrn(50);
        bitcoin.exchangeGrnToCurrency(10000);
        System.out.println(bitcoin.isCryptoCurrency());
    }
}
