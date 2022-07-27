package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01me {
    public static void main(String[] args) {
        	/* TASK :

	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */

        Scanner scan=new Scanner(System.in);
        System.out.print("olusturulacak array'in boyutunu giriniz : ");
        int boyut= scan.nextInt();
        int arr[]=new int[boyut];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("array in "+i+". elemanini giriniz :");
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int enBuyuk=arr[boyut-1];
        int enKucuk=arr[0];
        System.out.println("enKucuk = " + enKucuk);
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
