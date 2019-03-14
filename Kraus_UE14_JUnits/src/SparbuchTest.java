import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparbuchTest {

    public int kontoNr=1234;
    public double kapital=15;
    public double zinssatz = 3;

    Sparbuch sp = new Sparbuch(kontoNr,kapital,zinssatz);

    @Test
    void zahleEin() {
        int betrag=10;
        sp.zahleEin(betrag);
        assertEquals(kapital+betrag,sp.getKapital());
    }

    @Test
    void hebeAb() {
        double betrag=10.3;
        sp.hebeAb(betrag);
        assertEquals(kapital-betrag,sp.getKapital());
    }

    @Test
    void verzinse() {
        sp.verzinse();
        assertEquals(kapital*(1+(zinssatz/100)),sp.getKapital());
    }

    @Test
    void getKontoNr() {
        assertEquals(kontoNr,sp.getKontoNr());
    }

    @Test
    void getZinssatz() {
        assertEquals(1+(zinssatz/100),sp.getZinssatz());
    }

    @Test
    void getErtrag(){
        sp.getErtrag(5);
        assertEquals(kapital*(Math.pow((1+(zinssatz/100)),5)),sp.getKapital());
    }
}