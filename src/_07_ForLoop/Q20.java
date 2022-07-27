package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        //ekok=>bir sayi grubunda sayilarin ortak katlarinin en küçügüdür
        //ebob ise bu sayilari bölen en büyük sayidir
        //ekok =(sayi1*sayi2)/ebob
        //asal sayilarda 2 sayinin eboblari 1 e, ekoklari ise çarpimina eşittir

        Scanner scan=new Scanner(System.in);
        System.out.println("2 pozitif tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int ebob=0;

        for (int i = 1; i <=sayi1 && i<=sayi2; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }}
        System.out.println("ebob : "+ebob);
        System.out.println("ekok : "+ ((sayi1*sayi2)/ebob));
    }}