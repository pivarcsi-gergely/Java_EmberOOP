package hu.petrik.emberoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<Ember> emberLista;

    public Emberek(Ember[] emberTomb) {
        this.emberLista = new ArrayList<>();
        /*this.emberLista.addAll(Arrays.asList(emberTomb)); : addAll; a tömböt listává konvertálja viszont*/
        for (Ember ember: emberTomb) {
            this.emberLista.add(ember);
        }
    }

    public Emberek(String fajlNev){
        this.emberLista = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(";");
                Ember ember = new Ember(adatok[0], adatok[1], adatok[2]);
                this.emberLista.add(ember);
                sor = br.readLine();
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public int getAdottHonap(int adottHonap){
        int szamlalo = 0;

        for (Ember ember: emberLista) {
            if (adottHonap == ember.getSzuletesiHonap()){
                szamlalo++;
            }
        }
    return szamlalo;
    }

    public int atlagEletkor(){
        int atlagKor = 0;
        int darabSzam = 0;
        for (Ember ember: emberLista){
            darabSzam++;
            atlagKor += ember.getEletkor();
        }
        int eredmeny = atlagKor / darabSzam;
        return eredmeny;
    }




    @Override
    public String toString() {
        String ures = "";
        for (Ember ember: this.emberLista) {
            ures += ember + "\n";
        }
        return ures;
    }
}
