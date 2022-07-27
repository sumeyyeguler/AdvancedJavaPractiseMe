package _10_List;

import java.util.ArrayList;

public class Q10me {
    public static void main(String[] args) {
        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */

        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        ardisikToplam(arr);

    }

    private static ArrayList<Integer> ardisikToplam(int[] arr) {
        ArrayList<Integer> toplananSayilarList = new ArrayList<>();
        int count = 0;
        int toplananSayiAdedi = 1;//1 2 3

        while (arr.length - toplananSayiAdedi >= count) {
            int toplam = 0;
            for (int i = 0; i <= count; i++) {

            }
        }return ardisikToplam(arr);
    }
}
