package hu.petrik.emberoop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter formatum = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate szuletesiDatum = LocalDate.parse(szulDatum, formatum);
        Period kulonbseg = Period.between(maiDatum, szuletesiDatum);
        return kulonbseg.getYears();
    }



    @Override
    public String toString() {
        return String.format("%30s %-10s - %-20s", this.nev, this.szulDatum, this.szulHely);
    }
}
