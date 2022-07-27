package _07_ForLoop;

public class Q05 {

    public static void main(String[] args) {
        /* TASK :
Aşağıdaki şekilde çıktı veren programı print içerisinde
sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####

         */


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("#");
            }
            System.out.println();//ilk for loop tan cıkarken bosluk bırakıyor
        }

    }
}
