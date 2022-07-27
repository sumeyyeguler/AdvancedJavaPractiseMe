package _09_Arrays;

import java.util.Scanner;

public class Q13me {
    public static void main(String[] args) {
          /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        int arr[]=new int[8];
        Scanner scan=new Scanner(System.in);
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {  //bütün elemanları kullanıcıda alıyoruz
            System.out.print(i+". index elemani giriniz : ");
            arr[i]= scan.nextInt();
            if (arr[i]%3==0){
                sayac++;
            }
        }
        System.out.print("3 e bolunebilen eleman sayisi :"+sayac);




    }
}
