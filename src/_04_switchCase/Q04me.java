package _04_switchCase;

import java.util.Scanner;

public class Q04me {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("pazartesi : 1\nsali : 2\ncarsamba : 3\npersembe : 4\ncuma : 5\ncumartesi : 6\npazar : 7\n" +
                "haftanin hangi gününde oldugunuzu seciniz : ");
        int kacinciGun = scan.nextInt();




        if (kacinciGun<=0 || kacinciGun>7) {
            System.out.println("hatali veri girdiniz");
        }else
            System.out.println("kac gun sonrasini ogrenmek istiyorsunuz : ");
            int kacGunSonrasi = scan.nextInt();
            int buldugumuzGun = (kacinciGun + kacGunSonrasi) % 7;
            switch (buldugumuzGun) {

                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden sali");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden pazar");
                    break;
                default:
                    System.out.println("gecerli bir secim yapiniz");

            }


    }
    }

