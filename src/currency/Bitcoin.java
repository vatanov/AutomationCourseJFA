package currency;

public class Bitcoin extends Currency implements CurrencyCrypto {

    public Bitcoin(double kursNbu) {
        super(kursNbu);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double exchangeGrnToCurrency(double numberOfGrn) {
        System.out.println(String.format("You cannot exchange Grn to %s",
                this.getCurrencyName()));
        return -1.0;
    }
}
