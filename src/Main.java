import java.util.Scanner;

public class Main {
    static int sum(int sayi1, int sayi2) {
        int result = sayi1 + sayi2;
        System.out.println("sonuç  :" + result);
        return result;
    }

    static int minus(int sayi1, int sayi2) {
        int result = sayi1 - sayi2;
        System.out.println("sonuç  :" + result);
        return result;

    }

    static int multiplication(int sayi1, int sayi2) {
        int result = sayi1 * sayi2;
        System.out.println("sonuç  :" + result);
        return result;

    }

    static int division(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            System.out.println("sayi 2 0'a eşit olamaz");

        } else {
            int result = sayi1 / sayi2;
            System.out.println("sonuç :" + result);

        }
        return 0;
    }

    static int usHesap(int sayi1, int sayi2) {
        int result = 1;
        for (int i = 0; i < sayi2; i++) {
            result *= sayi1;
        }
        System.out.println("sonuç :" + result);
        return result;
    }

    static int mod(int sayi1, int sayi2) {
        int result = sayi1 % sayi2;
        System.out.println("sonuc :" + result);
        return result;
    }

    static void alanVecevre(int sayi1, int sayi2) {
        int alan = sayi1 * sayi2;
        int cevre = 2 * (sayi1 * sayi2);
        System.out.println("alan sonuç :" + alan);
        System.out.println("çevre sonuç :" + cevre);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı";

        System.out.println(menu);

        System.out.print("İşlem Seciniz Seçiniz :");
        menu = scan.nextLine();


        int say1;
        int sayi2;


        System.out.print("1.sayı giriniz :");
        say1 = scan.nextInt();
        System.out.print("2.sayi giriniz :");
        sayi2 = scan.nextInt();

        switch (menu) {
            case "1":
                sum(say1, sayi2);
                break;
            case "2":
                minus(say1, sayi2);
                break;
            case "3":
                multiplication(say1, sayi2);
                break;
            case "4":
                division(say1, sayi2);
                break;
            case "5":
                usHesap(say1, sayi2);
                break;
            case "6":
                mod(say1, sayi2);
                break;
            case "7":
                alanVecevre(say1, sayi2);
                break;
            default:
                System.out.println("Hatalı Tuşlama Yaptınız");

        }

    }
}