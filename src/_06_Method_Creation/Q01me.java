package _06_Method_Creation;

import java.util.Scanner;

public class Q01me {
    public static void main(String[] args) {
        /* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime= scanner.next();

        kelimeGir(kelime);

    }

    private static String kelimeGir(String kelime) {
        if (kelime.startsWith("gh")){
            System.out.println(kelime);
        }else if (kelime.startsWith("g")){
            System.out.println(kelime.substring(0,1)+kelime.substring(2));
        }else if (kelime.startsWith("h")){
            System.out.println(kelime.substring(1));
        }else System.out.println(kelime.substring(2));


    return kelime;
    }
}
