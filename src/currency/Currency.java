package currency;

import java.text.DecimalFormat;

abstract public class Currency {
    private double kursNbu;
    private double marga = 1.1; // 10% of income

    DecimalFormat df = new DecimalFormat("0.00");

    public Currency(double kursNbu) {

        this.kursNbu = kursNbu;
        setMarga(marga);
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
        if (!(this instanceof IsFreeConverted)) {
            this.marga = marga * 1.2;
            System.out.println(getCurrencyName() + " is not real currency.");
            System.out.println("Marga is changed. Current marga = " + df.format(this.marga));
        } else {
            if (((IsFreeConverted) this).isFreeConv() == false) {
                this.marga = marga *1.1;
                System.out.println(getCurrencyName() + " is not free converted currency.");
                System.out.println("Marga is changed. Current marga = " + df.format(this.marga));
            }
        }
    }

    public double getKursBuy() {
        return kursNbu * marga;
    }

    public double getKursSell() {
        return kursNbu / marga;
    }

    abstract String getCurrencyName();

    public double exchangeGrnToCurrency(double numberOfGrn) {
        Double tempResult = numberOfGrn / getKursBuy();
        System.out.println(String.format("For %s Grn you get %s %s by kurs %s (marga %s)",
                numberOfGrn, df.format(tempResult), getCurrencyName(), df.format(getKursBuy()), df.format(marga)));

        return tempResult;
    }

    public double exchangeCurrencyToGrn(double numberOfCurr) {
        Double tempResult = numberOfCurr * getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn by kurs %s (marga %s)",
                numberOfCurr, getCurrencyName(), df.format(tempResult), df.format(getKursSell()), df.format(marga)));

        return tempResult;
    }
}
