package _08_While_DoWhile;

import java.util.Scanner;

public class debnem {
    public static void main(String[] args) {
        String str="java cok güzel?";
        karakterSil(str);


    }

    private static void karakterSil(String str) {
        Scanner scan=new Scanner(System.in);
        System.out.println("silmek istediginiz karakteri giriniz : ");
        char karakter=scan.next().charAt(0);
        str=str.replace(karakter,'\u0000');
        System.out.println(str);
    }
}
