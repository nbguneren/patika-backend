import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double height, bmi, weight;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter you height(in meters): ");
        height = inp.nextDouble();
        System.out.print("Enter your weight(in KG): ");
        weight = inp.nextDouble();

        bmi = (weight / (height * height));
        System.out.print("Your body mass index is " + bmi);
    }
}
