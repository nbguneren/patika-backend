import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "patika", password = "java123", inpUserName, inpPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        inpUserName = inp.nextLine();

        System.out.print("Şifreniz: ");
        inpPassword = inp.nextLine();

        if(inpUserName.equals(userName) && inpPassword.equals(password)){
                System.out.println("Giriş yaptınız!");
        }else {
            System.out.print("Yanlış şifre girdiniz. Şifrenizi sıfırlamak isterseniz 1'e basın: ");
            inpPassword = inp.nextLine();
            if(inpPassword.equals("1")){
                System.out.print("Yeni şifrenizi giriniz: ");
                inpPassword = inp.nextLine();
                if(inpPassword.equals(password) || inpPassword.equals("") ){
                    System.out.print("Şifre oluşturulamadı lütfen başka şifre giriniz.");
                } else{
                    password = inpPassword;
                    System.out.print("Şifre oluşturuldu.");
                }
            }else {
                System.out.println("Program kapatılıyor.");
            }
        }
    }
}
