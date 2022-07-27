package _09_Arrays;

import java.util.Arrays;

public class Q05me {
    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7,8};
        int toplam = 0;
        int ortalama = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.print("ortalamadan büyük olanlar : ");
        for (int i = 0; i <arr.length ; i++) {
            ortalama=toplam/arr.length;
            if (arr[i]>ortalama){
                System.out.print(arr[i]+" ");
        }


    }//main sonu



}}

