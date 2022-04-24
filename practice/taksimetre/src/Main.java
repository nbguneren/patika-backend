import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float km, perKM = 2.2f, fee;
        int startingFee = 10, minimumFee = 20;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç KM yol gittiğinizi giriniz: ");
        km = inp.nextFloat();

        fee = km * perKM + startingFee;
        fee = fee < minimumFee ? minimumFee : fee;
        System.out.print("Ücret: " + fee);
    }
}
