package _03_IfStatement_TernaryOperator;

import javax.swing.*;
import java.util.Scanner;

public class Q01me {
    public static void main(String[] args) {
         /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz */


        Scanner scan=new Scanner(System.in);
        System.out.println("toplama icin 1\nçıkarma için 2\nçarpma için 3\nbölme için 4 yaziniz");
        int islem=scan.nextInt();

        System.out.println("lütfen 2 tam sayi giriniz");
        double num1= scan.nextDouble();
        double num2= scan.nextDouble();

        if (islem==1){
            System.out.println("iki sayi toplami : "+ (num1+num2));
        } else if (islem==2){
            System.out.printf("iki sayi farki : " + (num1-num2));
        } else if (islem==3){
            System.out.printf("iki sayi çarpimi : " + (num1*num2));
        }else if (islem==4){
            System.out.printf("iki sayi bölümü : " + (num1/num2));
        }else System.out.printf("hatali secim yaptiniz lutfen tekrar deneyin");















    }
}
