package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02me {
    public static void main(String[] args) {

        //JAVA RUN TİME BİR PROGLAMLAMA DİLİDİR. YUKARIDAN ASAGI DOGRU CALISIR
        //SOLDAN SAGA DOGRU OKUR
        //SAĞDAN SOLA DOGRU ASSİGNMENT YAPAR

        	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen

	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 3 tane pozitif tams ayi giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
            if (a==b && b==c){
                System.out.println("ücgen ve eskenardır");
            }else System.out.println("ucgen fakat eskenar degildir");
        }else System.out.println("ucgen degildir");


    }
}
