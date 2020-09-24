package pl.michalski.zajecia240920;

import java.io.IOException;

public interface TxtManager {
    void dodajDoPliku(String napis) throws IOException;

    void wyswietlPlikTxt() throws IOException;
}
