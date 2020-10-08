package pl.michalski.zajecia011020;

public class Bottle {
    static Integer iloscLitrow = 50;
    Integer iloscLitroAleNieStatic = 100;

    public static void metodaStatyczna(){
        System.out.println("Jestem w metodzie statycznej " + iloscLitrow);
    }
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        Bottle bottle2 = new Bottle();

        System.out.println(bottle1.iloscLitroAleNieStatic);
        System.out.println(Bottle.iloscLitrow);
        System.out.println(bottle2.iloscLitroAleNieStatic);
        System.out.println(Bottle.iloscLitrow);
        bottle1.iloscLitroAleNieStatic -= 30;
        Bottle.iloscLitrow -= 10;

        System.out.println("----------------------------");
        System.out.println(bottle1.iloscLitroAleNieStatic);
        System.out.println(Bottle.iloscLitrow);
        System.out.println(bottle2.iloscLitroAleNieStatic);
        System.out.println(Bottle.iloscLitrow);


        Bottle.metodaStatyczna();
    }
}
