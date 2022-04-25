import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5.0f;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplamTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armutKilo = inp.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elmaKilo = inp.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        domatesKilo = inp.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muzKilo = inp.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        patlicanKilo = inp.nextDouble();

        toplamTutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.print("Toplam tutar: " + toplamTutar);
    }
}
