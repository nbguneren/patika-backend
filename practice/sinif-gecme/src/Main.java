import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, ortalama = 0, bolme = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        if(!(mat < 1 || mat > 99)){
            ortalama += mat;
            bolme += 1;
        }
        if(!(fizik < 1 || fizik > 99)){
            ortalama += fizik;
            bolme += 1;
        }
        if(!(turkce < 1 || turkce > 99)){
            ortalama += turkce;
            bolme += 1;
        }
        if(!(kimya < 1 || kimya > 99)){
            ortalama += kimya;
            bolme += 1;
        }
        if(!(muzik < 1 || muzik > 99)){
            ortalama += muzik;
            bolme += 1;
        }

        ortalama /= bolme;
        if (ortalama < 55){
            System.out.println("Ortalamanız: " + ortalama +  "\nDersten kaldınız.");
        }else {
            System.out.println("Ortalamanız: " + ortalama + "\nDersi geçtiniz.");
        }
    }
}
