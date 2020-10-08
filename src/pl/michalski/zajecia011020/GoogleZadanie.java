package pl.michalski.zajecia011020;

import java.util.Arrays;
import java.util.Random;

public class GoogleZadanie {

    private Integer[] tablicaLiczb = new Integer[300];

    private Integer prawdopodobienstwo() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private Integer zwrotNaPodstawiePrawdopodobienstwa() {
        Random random2 = new Random();
        Integer los = prawdopodobienstwo();
        if (los < 50) {
            return random2.nextInt(250); // zakres ma byc od 0 - 249
        } else if (los >= 50 && los < 80) {
            return random2.nextInt(750) + 250; //zakres ma byc od 250 - 999
        } else if (los >= 80 && los < 95) {
            return random2.nextInt(3000) + 1000;// zakres ma byc od 1000 - 3999
        } else {
            return random2.nextInt(6001) + 4000;// zakres ma byc od 4000 - 10000
        }
    }


    public void dodajWylosowaneLiczbyDoTablicy(){
        for(int x =0 ; x < 300; x++) {
            tablicaLiczb[x] = zwrotNaPodstawiePrawdopodobienstwa();
        }
    }

    public Integer[] getTablicaLiczb() {
        return tablicaLiczb;
    }

    public static void main(String[] args) {
        GoogleZadanie googleZadanie = new GoogleZadanie();
        googleZadanie.dodajWylosowaneLiczbyDoTablicy();
        System.out.println(Arrays.toString(googleZadanie.getTablicaLiczb()));

    }
}
