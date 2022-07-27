package _04_switchCase;

import java.util.Scanner;

public class Q03me {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan=new Scanner (System.in);
        System.out.println("hangi aya ait veriyi ogrenmek istiyorsunuz");
        int ay= scan.nextInt();
        
        switch (ay){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("girdiginiz ayda 31 gün vardir"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiginiz ayda 30 gün vardir");break;
            case 2:
                System.out.println("hangi yılda oldugunuzu giriniz");
                int yil= scan.nextInt();
                if (yil%4==0){
                    System.out.println("girdiginiz ay 29 gündür");

                }else System.out.println("girdiginiz ay 28 gündür");break;
            default:
                System.out.println("lütfen 1 ile 12 arasında bir deger giriniz");
        }


    }
}
