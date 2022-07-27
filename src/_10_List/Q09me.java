package _10_List;

import java.util.Arrays;
import java.util.Scanner;

public class Q09me {
    public static void main(String[] args) {
        /*
       Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz :");//split kullanmam gerekecegi için array alacagız
        String arr[]=scan.nextLine().split("");//hiçlik ile metni parçalara ayırdık
        System.out.println(Arrays.toString(arr));
        String enCokTekrarEdenKarakter="";
        int maxSayac=0;
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {//elimde tuttugum karsılastıracagım karakter
            for (int j =i+1; j <arr.length ; j++) {//i+1 yazmasaydım kendisiylede karsılastıracaktı
                if (arr[i].equalsIgnoreCase(arr[j])){//h a ile esitse sayacı artır
                  sayac++;
                }

            }
            if (sayac>maxSayac){
                maxSayac=sayac;
                enCokTekrarEdenKarakter=arr[i];
            }else if (sayac==maxSayac){
                enCokTekrarEdenKarakter+=", "+arr[i];
            }
            sayac=0;
        }
        System.out.println(enCokTekrarEdenKarakter);
    }
}
