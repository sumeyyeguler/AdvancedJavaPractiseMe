package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05me {
    public static void main(String[] args) {

        /* NESTED İF KULLANİLİR
        İÇ İÇE İF LERDEN OLUSUR
         */

      		/*
		TASK :
		Kullanicidan (scanner)  yasini (double)  ve kilosunu (double) aliniz(kiloyu ve yası bir variable a atamalıyız)
		18 yasindan kucuk ise (şart oldu if) kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise (sart oldu if) kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("lütfen kilonuzu giriniz");
        double kilo = scan.nextDouble();


        if (yas > 0 && yas < 18) {
            System.out.println("yasiniz kan bagisi icin tutmuyor");
        } else if (yas >= 18)
            if (kilo > 0 && kilo < 50) {
                System.out.println("kilonuz kan bagasi icin uygun degil");
            } else if (kilo >= 50) {
                System.out.println("kan bagisi yapabilirsiniz");
            } else System.out.println("lütfen gecerli bir yas giriniz");
        else System.out.println("hatali veri girdiniz");


    }
}
