package _07_ForLoop;

public class Q21_3cozum {
    public static void main(String[] args) {

      /*
        * * * * * * * * * *
         * * * * * * * * *
          * * * * * * * *
           * * * * * * *
            * * * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *

       */


        int l, m, n;//Değişekenlerimizi tanımladık.
        for (l = 10; 0 < l; l--) {//Döngümüzün ne kadar döneceğini belirtir.
            for (m = l; m < 10; m++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (n = 1; n <= l; n++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
    }
}}
