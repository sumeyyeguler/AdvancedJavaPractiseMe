package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        //kullanici scanner class, string isim, 3 harfli diyor length, ternary ?:
        //harfleri eşit mi !eguals,char

        Scanner scan=new Scanner(System.in);
        System.out.print("bir isim giriniz : ");
        String isim= scan.nextLine();

        char harf1=isim.charAt(0);//kullanicidan gelen ismin ilk 3 harfini aliyorum
        char harf2=isim.charAt(1);
        char harf3=isim.charAt(2);

        String sonuc =isim.length()==3 ?((harf1!=harf2 && harf1!=harf3 && harf2!=harf3)?"girdiginiz isim 3 harfi ve uniq " +
                "karaktere sahip.":"girdiginiz isim 3 harfli ve uniq karaktere sahip degil"):
                "girdiginiz isim 3 harfli degil.";
        System.out.println(sonuc);

        //if ile calisabiliriz

    }
}