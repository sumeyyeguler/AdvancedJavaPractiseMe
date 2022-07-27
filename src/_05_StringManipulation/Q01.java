package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("string ifadeler giriniz");
        String ifade= scan.nextLine();

        if (ifade.contains(" ")){
            System.out.println("bosluk icerir");
        }else if (!ifade.contains(" "))
            System.out.println("bosluk icermez");










    }
}

