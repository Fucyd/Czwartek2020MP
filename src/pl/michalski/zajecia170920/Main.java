package pl.michalski.zajecia170920;

public class Main {

    // napisz metodę, która przyjmie jeden parametr typu String i jeden typu char;
    // metoda ma zliczyć okręloną liczbę liter w napisie i potem te liczbę zwrócić.


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Znaleziono liter: " + main.liczLiteryNapisu("0000000001000000101001010101010100000000000000", '0'));
        System.out.println("Znaleziono liter: " + main.liczLiteryNapisu("01", '0'));
        System.out.println("Znaleziono liter: " + main.liczLiteryNapisu("1", '0'));
        System.out.println("Znaleziono liter: " + main.liczLiteryNapisu("000000000000000000000000000011111111111111111111111111111111111111111111111111111111100000001000000101001010101010100000000000000", '0'));

    }

    public int liczLiteryNapisu(String napis, char litera){
        int liczbaZer =0;
        int liczbaLiter = 0;
        for(int x =0; x<napis.length(); x++){
            if(napis.charAt(x) == litera){
                liczbaLiter++;
            }else{
                if(liczbaLiter > liczbaZer){
                    liczbaZer = liczbaLiter;
                    liczbaLiter =0;
                }else {
                    liczbaLiter =0;
                }


            }
        }
        return liczbaZer;
    }
}
