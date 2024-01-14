package currency;

abstract public class CurrencyReal extends Currency{
    boolean isFreeConverted;
    public CurrencyReal(double kursNbu) {
        super(kursNbu);
    }
    abstract String getCurrencyName();

}
