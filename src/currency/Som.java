package currency;

public class Som extends Currency implements IsFreeConverted {
    public Som(double kursNbu) {
        super(kursNbu);
    }

    @Override
    String getCurrencyName() {
        return "Som";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
