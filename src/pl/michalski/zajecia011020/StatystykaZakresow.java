package pl.michalski.zajecia011020;

public class StatystykaZakresow {
    private int zakres1;
    private int zakres2;
    private int zakres3;
    private int zakres4;

    public void wyswietlStatystyke(){
        System.out.println("Zakres 1: " + zakres1);
        System.out.println("Zakres 2: " + zakres2);
        System.out.println("Zakres 3: " + zakres3);
        System.out.println("Zakres 4: " + zakres4);
        int suma = zakres1 + zakres2 + zakres3 + zakres4;
        System.out.println("\nŁącznie wywołań: " + suma);
    }

    public StatystykaZakresow() {
        zakres1 = 0;
        zakres2 = 0;
        zakres3 = 0;
        zakres4 = 0;
    }

    public int getZakres1() {
        return zakres1;
    }

    public void setZakres1() {
        this.zakres1++;
    }

    public int getZakres2() {
        return zakres2;
    }

    public void setZakres2() {
        this.zakres2++;
    }

    public int getZakres3() {
        return zakres3;
    }

    public void setZakres3() {
        this.zakres3++;
    }

    public int getZakres4() {
        return zakres4;
    }

    public void setZakres4() {
        this.zakres4++;
    }
}
