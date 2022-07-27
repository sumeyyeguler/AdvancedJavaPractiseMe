package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04me {
    public static void main(String[] args) {

        /* EQUALS METHODU VERİLEN 2 STRİNG DEGİSKENİ KARSİLASTİRMAK İCİN KULLANILIT CAMEL CASE
        GECERLİDİR, BU YÜZDEN TOLOWERCASE VE TOUPPERCASE KULLANILMASI GEREKİR
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
        System.out.print("qa\ndev\nba\npm\nlütfen mesleginizi seciniz : ");
        String meslek= scan.nextLine();

        String qa="Quality Analyst";
        String dev="developer";
        String ba="Busines Analyst";
        String pm="Project Manager";

        if (meslek.toLowerCase().equals("qa")){
            System.out.println("mesleginiz : " + qa);
        }else if (meslek.toLowerCase().equals("dev")){
            System.out.println("mesleginiz : " + dev);
        }else if (meslek.toLowerCase().equals("ba")){
            System.out.println("mesleginiz : " + ba);
        }else if (meslek.toLowerCase().equals("pm")){
            System.out.println("mesleginiz : " + pm);
        }else System.out.println("lütfen gecerli bir meslek yaziniz");





    }
}
