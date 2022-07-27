package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10meBunuCoz {
    public static void main(String[] args) {

         /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hizinizi giriniz");
        double hiz= scan.nextDouble();
        System.out.println("ehliyetiniz var ise 1 yok ise 0 yaziniz");
        int ehliyet= scan.nextInt();

        if (ehliyet==1 || ehliyet==0 ){
            if (ehliyet==0){
                System.out.println("ehliyetsiz surus ceza bedeli 200$");
            }
        }


    }
}
