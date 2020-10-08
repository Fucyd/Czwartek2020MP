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
        Integer min = 255;
        Integer max =0;
        Scanner scanner = new Scanner(new File("/home/piotr/Pulpit/Dane_PR2/dane-matura.txt"));
        while (scanner.hasNext()){
            Integer liczba = Integer.parseInt(scanner.next());
            if(liczba < min){ min = liczba; }
            if(liczba > max){ max = liczba; }
        }
        scanner.close();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) throws IOException {
        TxtManager txtManager = new TxtManagerImplementation();
        txtManager.wyswietlPlikTxt();
        }
}
//  1 2 4 5 9 10  | 10 9 5 4 2 1    // ma pionową oś symetrii
//  1 2 4 5 9 10  | 10 9 5 4 2 2  // nie ma pionowej osi symetrii