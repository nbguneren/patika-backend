import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdv, kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = inp.nextDouble();
        kdv = tutar > 1000 ? 0.08 : 0.18;

        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar + "\nKDV oranı: " + kdv + "\nKDV'li tutar: " + kdvliTutar + "\nKDV tutarı: " + kdvTutar);
    }
}
