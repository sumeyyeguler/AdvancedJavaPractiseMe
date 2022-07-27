package _07_ForLoop;

import java.util.Scanner;

public class Q03me {
    public static void main(String[] args) {
         /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
          */

        Scanner scan=new Scanner(System.in);
        System.out.println("string bir cumle giriniz");
        String cumle= scan.nextLine();
        int toplamA=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a'){
                toplamA++;
            }else if (cumle.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("cumledeki c harfine kadar kullanilan a harfi sayisi : "+ toplamA);


    }
}
