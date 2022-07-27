package _06_Method_Creation;

import java.util.Scanner;

public class methodCozum {
    public static void main(String[] args) {
      //3 sayi topla methodu

        Scanner scan=new Scanner(System.in);
        System.out.println("3 sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        toplama(sayi1,sayi2,sayi3);

        System.out.println("toplam : "+(sayi1+sayi2+sayi3));





    }

    private static int toplama(int sayi1, int sayi2, int sayi3) {
        int toplam=sayi1+sayi2+sayi3;
        return toplam;
    }}
