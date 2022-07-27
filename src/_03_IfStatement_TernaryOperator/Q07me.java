package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07me {
    public static void main(String[] args) {
        	/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf>='a' && harf<='z'){
            System.out.println("karakter küçük harflidir");
        }else if (harf>='A'&& harf<='Z'){
            System.out.println("karakter büyük harflidir");
        }else System.out.println("lütfen gecerli bir karakter giriniz.");













    }}