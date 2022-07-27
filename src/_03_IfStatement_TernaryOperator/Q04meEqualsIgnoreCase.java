package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04meEqualsIgnoreCase {
    public static void main(String[] args) {


        /* EQUALS IGNORE CASE METHODU VERİLEN İKİ STRİNG DEGİSKENİ BUYUK HARF KUCUK HARF GOZETMEKSİZİN
        KARSİALTİRİR. OUTPUT TRUE YADA FALSE TUR.
         */

        	/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nlütfen mesleginizi giriniz : ");
        String meslek= scan.nextLine().toLowerCase();

        String qa="Quality Analyst";
        String dev="Developer";
        String ba="Busines Analyst";
        String pm="Project Manager";

        if (meslek.equalsIgnoreCase("aq")){
            System.out.println("mesleginiz : " +qa);
        }else if (meslek.equalsIgnoreCase("dev")){
            System.out.println("mesleginiz : " + dev);
        }else if (meslek.equalsIgnoreCase("ba")){
            System.out.println("mesleginiz : " + ba);
        }else if (meslek.equalsIgnoreCase("pm")){
            System.out.println("mesleginiz : " +pm);
        }else System.out.println("lütfen gecerli bir meslek giriniz");


    }
}
