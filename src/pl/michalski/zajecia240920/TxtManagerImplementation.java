package pl.michalski.zajecia240920;

import java.io.*;
import java.util.Scanner;

public class TxtManagerImplementation implements TxtManager {


    @Override
    public void dodajDoPliku(String napis) throws IOException {
        FileWriter fileWriter = new FileWriter(
                new File("/home/piotr/IdeaProjects/Czwartek2020MP/src/pl/michalski/zajecia240920/dane.txt"),
                true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(napis);
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();

    }

    @Override
    public void wyswietlPlikTxt() throws IOException {
        Scanner scanner = new Scanner(new File("/home/piotr/IdeaProjects/Czwartek2020MP/src/pl/michalski/zajecia240920/dane.txt"));
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        TxtManager txtManager = new TxtManagerImplementation();
        txtManager.wyswietlPlikTxt();
        System.out.println("------Po Zmianie---------");
        for(int x = 0; x<10000; x++ ) txtManager.dodajDoPliku("Za szybko robi sie ciemno");
        txtManager.wyswietlPlikTxt();
    }
}
