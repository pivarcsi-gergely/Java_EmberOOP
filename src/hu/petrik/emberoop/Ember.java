package hu.petrik.emberoop;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    @Override
    public String toString() {
        return String.format("$s - $s - $s", this.nev, this.szulDatum, this.szulHely);
    }
}
