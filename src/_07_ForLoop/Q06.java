package _07_ForLoop;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {



    /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.


 */
        Scanner scan=new Scanner(System.in);
        System.out.println("matriks yapisi olusturmak icin sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            for (int j = 1; j <sayi ; j++) {
                System.out.print(i*j+"  ");

            }
            System.out.println();

        }

}}
