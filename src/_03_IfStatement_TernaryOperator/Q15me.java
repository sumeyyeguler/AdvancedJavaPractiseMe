package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15me {
    public static void main(String[] args) {
       /* TASK :
        Kullanici tarafindan girilen bir sayinin
        mutlak degerini yazdiran code create ediniz.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz = ");
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println(sayi);
        }else if (sayi<0){
            System.out.println(sayi*(-1));
        }



    }
}
