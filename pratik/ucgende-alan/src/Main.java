import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cevre, alan, u, a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("A kenarının uzunluğunu giriniz: ");
        a = inp.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz: ");
        b = inp.nextDouble();
        System.out.print("C kenarının uzunluğunu giriniz: ");
        c = inp.nextDouble();

        cevre = a + b + c;
        u = cevre/2.0f;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı: " + alan);
    }
}
