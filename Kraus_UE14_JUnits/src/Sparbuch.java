import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sparbuch {

    protected int kontoNr;
    protected double kapital;
    protected double zinssatz;

    public Sparbuch(int kontoNr, double kapital, double zinssatz) {
        this.kontoNr = kontoNr;
        this.kapital = kapital;
        this.zinssatz = 1+(zinssatz/100);
    }

    public void zahleEin(double betrag){
        this.kapital += betrag;
    }
    public void hebeAb(double betrag){
        this.kapital-=betrag;
    }
    public void getErtrag(double jahre){
        this.kapital = this.kapital*Math.pow(zinssatz,jahre);
    }
    public void verzinse(){
        this.kapital*= zinssatz;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    public double getKapital() {
        return kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }
}
