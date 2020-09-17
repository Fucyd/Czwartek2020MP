package pl.michalski;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
        System.out.println(main.liczLitery("je je e", 'e'));

    }



    public int liczLitery(String napis, char litera){
        int iloscLiter = 0;
        for(int x =0; x<napis.length(); x++){
            if(napis.charAt(x) == litera){
                iloscLiter++;
            }
        }
        return iloscLiter;
    }

    public int zwrocDlugoscStringa(String s){
        return s.length();
    }
}
