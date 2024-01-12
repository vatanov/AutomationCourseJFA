package currency;

public class Currency {
    private double kursNbu;
    private double marga = 1.1; // 10% of income

    public Currency(double kursNbu) {
        this.kursNbu = kursNbu;
    }

    public double getKursNbu() {
        return kursNbu;
    }

    public void setKursNbu(double kursNbu) {
        this.kursNbu = kursNbu;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }
}
