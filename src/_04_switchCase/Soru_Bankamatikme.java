package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatikme {
    public static void main(String[] args) {
        //baslangıc bakiyesi verilmiş, int double olur
        //her bir islem icin case acarsın
        //para yatirma cekme cıkıs bakiye sorma birer case
        //her case de birer aksiyon var cekme isleminde bakiye kontrol yapilir
        //yatirma isleminde parayi eski bakiyeye eklememiz lazım


        Scanner scan=new Scanner(System.in);
        System.out.println("hosgeldiniz! lütfen yapmak istediginiz islem icin tuslayiniz\nbakiye sorgulama : 1\npara cekme : 2" +
                "\npara yatirma : 3\ncikis : 4");
        int islem= scan.nextInt();
        int bakiye=1000;

        switch (islem){

            case 1:
                System.out.println("guncel bakiyeniz : "+bakiye);

            case 2:
                System.out.println("cekmek istediginiz tutari giriniz");
               int cekilenTutar= scan.nextInt();
               if (bakiye>=cekilenTutar){
                   System.out.println("isleminiz gerceklesiyor... kalan bakiyeniz : "+(bakiye-cekilenTutar));
               }else System.out.println("bakiye yetersiz");break;

            case 3:
                System.out.println("yatirmak istediginiz tutari giriniz");
                int yatirilanTutar=scan.nextInt();
                bakiye+=yatirilanTutar;
                System.out.println("toplam bakiyeniz : "+bakiye);break;
            case 4:
                System.out.println("tekrar bekleriz");break;
            default:
                System.out.println("gecerli bir secim yapiniz");












        }











    }
}
