import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int angle;
        float radius, pi = 3.14f, areaOfCircleSector;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        radius = inp.nextFloat();
        System.out.print("Enter the central angle of circle sector: ");
        angle = inp.nextInt();

        areaOfCircleSector = (pi * (radius * radius) * angle)/360;
        System.out.print("Area of circle sector: " + areaOfCircleSector);
    }
}
