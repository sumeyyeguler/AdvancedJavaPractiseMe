package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.//scanner a gerek yok
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        //charAt(0) dersem karakterleri verir bu statik olur dinamik olsun istiyoruz
        //i a ve l nin yerini bulup yazdirabiliriz
        //index of methodu istedigim karakterin yerini söyler
        //char at de o indexe gidip ordaki elemani getirir

        String  harfler = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char a=harfler.charAt(harfler.indexOf("A"));//index of a nın yerini verdi 0 , char at te ayi getirdi
        char l=harfler.charAt(harfler.indexOf("L"));
        char i=harfler.charAt(harfler.indexOf("I"));

        System.out.println(""+a+l+i);//ascı degerini getirmemesi icin hiçlik koyariz concat yapariz
        char Q=harfler.charAt(harfler.indexOf("Q"));
        System.out.println(Q);



    }

}
