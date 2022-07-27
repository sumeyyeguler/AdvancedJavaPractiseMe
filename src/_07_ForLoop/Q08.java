package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scan.next().toLowerCase();
        String tersKelime = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }if (kelime.equals(tersKelime)){
            System.out.println("kelime palindrome dur");
        }else System.out.println("kelime palindrome degildir");
    }
}

