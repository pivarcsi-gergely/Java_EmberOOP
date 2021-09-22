package hu.petrik.emberoop;

import java.time.LocalDate;
import java.time.Period;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEv(){
        String szuletesiEvStringben = szulDatum.substring(0,4);
        return Integer.parseInt(szuletesiEvStringben);
    }

    public int getSzuletesiHonap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[1]);
    }
    public int getSzuletesiNap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[2]);
    }
    public int getEletkor(){
        LocalDate maiDatum = LocalDate.now();
        LocalDate szuletesiDatum = LocalDate.parse(szulDatum);
        Period kulonbseg = Period.between(maiDatum, szuletesiDatum);
        return kulonbseg.getYears();
    }



    @Override
    public String toString() {
        return String.format("$s - $s - $s", this.nev, this.szulDatum, this.szulHely);
    }
}
