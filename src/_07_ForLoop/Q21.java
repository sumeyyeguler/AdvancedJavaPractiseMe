package _07_ForLoop;

public class Q21 {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */






        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *       */




        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         */
        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */


        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */


        int o, p, r;//Değişekenlerimizi tanımladık.
        for (o = 1; o < 10; o++) {//Döngümüzün ne kadar döneceğini belirtir.
            for (p = o; p < 10; p++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (r = 1; r <= o; r++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }


    }
}


