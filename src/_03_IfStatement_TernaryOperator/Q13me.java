package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13me {
    public static void main(String[] args) {
            /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
        Scanner scan=new Scanner(System.in);

        System.out.print("a kenar uzunlugu : ");
        int a= scan.nextInt();

        System.out.print("b kenar uzunlugu : ");
        int b= scan.nextInt();

        System.out.print("c kenar uzunlugu :");
        int c= scan.nextInt();


        //VEYA İLE DE YAPİLABİLİR

        if ((a*a)+(b*b)==c*c){
            System.out.println("dik ücgendir");
        }else if (((a*a)+(c*c)==b*b)) {
            System.out.println("dik ucgendir");
        }else if (((b*b)+(c*c)==a*a)){
            System.out.println("dik ucgendir");
        }else System.out.println("gecerli bir deger giriniz");



    }
}
