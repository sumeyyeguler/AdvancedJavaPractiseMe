package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
                /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

      Scanner scan=new Scanner(System.in);

      System.out.println("musteri kartiniz var mi? varsa yes yoksa no yaziniz");
      boolean kartVarMi=scan.nextBoolean();

      System.out.println("kac adet urun aldiniz");
      int urunAdedi=scan.nextInt();

      System.out.println("aldigiz urunun liste fiyatini giriniz");
      double fiyat=scan.nextDouble();
      double tutar;


      if (kartVarMi){
          if (urunAdedi>10){
              tutar=fiyat*20/100*urunAdedi;
              System.out.println("% 20 indirim kazandiniz odemeniz gereken tutar "+tutar);
          }else {
              tutar=fiyat*15/100*urunAdedi;
              System.out.println("odemeniz gereken tutar " + tutar);
          }
      }else{
          if (urunAdedi>10){
              tutar=fiyat*15/100*urunAdedi;
              System.out.println("odemeniz gereken tutar "+tutar);
          }else {
              tutar=fiyat*10/100*urunAdedi;
              System.out.println("odemeniz gereken tutar " + tutar);
          }
      }

    }
}
