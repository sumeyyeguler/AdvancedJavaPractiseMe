package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06me {
    public static void main(String[] args) {

        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("X ve Y degerleri giriniz");
        int x= scan.nextInt();
        int y= scan.nextInt();

        if (x>0 && y>0){
            System.out.println("degerler 1. bölgededir");
        }else if (x<0 && y>0){
            System.out.println("degerler 2. bölgededir");
        }else if (x<0 && y<0){
            System.out.println("degerler 3. bölgededir");
        }else if (x>0 && y<0){
            System.out.println("degerler 4. bölgededir");
        }else if (x==0 && y>0) {
            System.out.println("degerler Y ekseni üzerindedir");
        }else if (y==0 && x>0) {
            System.out.println("degerler X ekseni üzerindedir");
        }else if (x==0 && y==0){
            System.out.println("girdiginiz degerler orjindedir");
        }else System.out.println("lütfen istenen degerleri dogru giriniz");




    }
}
