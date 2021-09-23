package hu.petrik.emberoop;

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
}
