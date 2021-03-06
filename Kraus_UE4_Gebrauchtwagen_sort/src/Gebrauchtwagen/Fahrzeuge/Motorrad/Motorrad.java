/*
Übung Gebrauchtwagen von: Maximilian Kraus
19.9.2018

Die Klasse Motorrad implementiert Fortbewegungsmittel.
 */
package Gebrauchtwagen.Fahrzeuge.Motorrad;

import Gebrauchtwagen.Interfaces.Fortbewegungsmittel;

public class Motorrad implements Fortbewegungsmittel {

    //Konstruktor

    //Attributes
    protected String name;
    protected int erstzulassungsjahr;
    protected float leistung;
    protected float spritverbrauch;
    protected float eurotaxJeinkaufpreis;
    protected float realEinkaufspreis;
    protected float eurotaxJverkaufspreis;
    protected String motortyp;

    public Motorrad(String name, int erstzulassungsjahr, float leistung, float spritverbrauch, float eurotaxJeinkaufpreis, float realEinkaufspreis, float eurotaxJverkaufspreis, String motortyp) {
        this.name = name;
        this.erstzulassungsjahr = erstzulassungsjahr;
        this.leistung = leistung;
        this.spritverbrauch = spritverbrauch;
        this.eurotaxJeinkaufpreis = eurotaxJeinkaufpreis;
        this.realEinkaufspreis = realEinkaufspreis;
        this.eurotaxJverkaufspreis = eurotaxJverkaufspreis;
        this.motortyp = motortyp;
    }

    //Getter&Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getErstzulassungsjahr() {
        return erstzulassungsjahr;
    }

    public void setErstzulassungsjahr(int erstzulassungsjahr) {
        this.erstzulassungsjahr = erstzulassungsjahr;
    }

    public float getLeistung() {
        return leistung;
    }

    public void setLeistung(float leistung) {
        this.leistung = leistung;
    }

    public float getSpritverbrauch() {
        return spritverbrauch;
    }

    public void setSpritverbrauch(float spritverbrauch) {
        this.spritverbrauch = spritverbrauch;
    }

    public float getEurotaxJeinkaufpreis() {
        return eurotaxJeinkaufpreis;
    }

    public void setEurotaxJeinkaufpreis(float eurotaxJeinkaufpreis) {
        this.eurotaxJeinkaufpreis = eurotaxJeinkaufpreis;
    }

    public float getRealEinkaufspreis() {
        return realEinkaufspreis;
    }

    public void setRealEinkaufspreis(float realEinkaufspreis) {
        this.realEinkaufspreis = realEinkaufspreis;
    }

    public float getEurotaxJverkaufspreis() {
        return eurotaxJverkaufspreis;
    }

    public void setEurotaxJverkaufspreis(float eurotaxJverkaufspreis) {
        this.eurotaxJverkaufspreis = eurotaxJverkaufspreis;
    }

    public String getMotortyp() {
        return motortyp;
    }

    public void setMotortyp(String motortyp) {
        this.motortyp = motortyp;
    }

    //Interface Methoden

    @Override
    public int anzPassagiere() {
        return 2;
    }

    @Override
    public float kmpreis() {
        return spritverbrauch / 100;
    }

    @Override
    public float getPreis() {
        return eurotaxJverkaufspreis;
    }

    //toString


    @Override
    public String toString() {
        return "Name: " + name + ", Erstzulassungsjahr: " + erstzulassungsjahr + ", Leistung: " + leistung + ", Spritverbrauch: " + spritverbrauch + ", EurotaxJeinkaufpreis: " + eurotaxJeinkaufpreis + ", RealEinkaufspreis: " + realEinkaufspreis + ", EurotaxJverkaufspreis: " + eurotaxJverkaufspreis + ", Motortyp: " + motortyp;
    }
}
