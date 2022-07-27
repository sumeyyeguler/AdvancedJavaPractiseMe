package _06_Method_Creation;

import java.util.Scanner;

public class Q03me {
    /*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("cevirmek istediginiz islem icin secim yapiniz\nsaat icin 1\nmil icin 2\nkg icin 3 tuslayiniz :");
        int islem = scan.nextInt();
        System.out.print("saat, mil veya kg degeri giriniz :");
        double sayi = scan.nextDouble();

        cevir(islem, sayi);
    }

    private static void cevir(int islem, double sayi) {

        switch (islem) {
            case 1:
                double sonuc1 = sayi * 3600;
                System.out.println(sayi + " saat " + sonuc1 + " dakikadir.");
                break;
            case 2:
                double sonuc2 = sayi * 1.61;
                System.out.println(sayi + " mil " + sonuc2 + " kilometredir");
                break;
            case 3:
                double sonuc3 = sayi * 1000;
                System.out.println(sayi + " kg " + sonuc3 + " gramdir");
                break;
            default:
                System.out.println("hatali giriş");
        }
    }
}
