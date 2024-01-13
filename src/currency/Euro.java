package currency;

public class Euro extends Currency implements IsFreeConverted {

    public Euro(double kursNbu) {
        super(kursNbu);
    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
