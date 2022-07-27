package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12me {
    public static void main(String[] args) {
                /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("final notunuz : ");
        double finalNotu= scan.nextDouble();

        System.out.println("vize notunuz : ");
        double vizeNotu= scan.nextDouble();

        System.out.println("final yüzdeniz :");
        double finalYuzdesi= scan.nextDouble();

        System.out.println("vize yüzdeniz : ");
        double vizeYuzdesi= scan.nextDouble();

        double notOrtalama=((vizeNotu*vizeYuzdesi)/100)+((finalNotu*finalYuzdesi)/100);

        if (notOrtalama>=50){
            System.out.println("dersi basariyla gectiniz");
        }else if (notOrtalama<50){
            System.out.println("maalesef kaldiniz");
        }else System.out.println("hatali giris");


    }
}
