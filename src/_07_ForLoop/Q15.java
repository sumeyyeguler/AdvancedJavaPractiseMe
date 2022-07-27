package _07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {

        for (char satir = 'A'; satir <='F' ; satir++) {
            for (char i = 'A'; i <=satir ; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
