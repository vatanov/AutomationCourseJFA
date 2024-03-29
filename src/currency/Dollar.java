package currency;

public class Dollar extends Currency implements IsFreeConverted {
    public Dollar(double kursNbu) {
        super(kursNbu);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
