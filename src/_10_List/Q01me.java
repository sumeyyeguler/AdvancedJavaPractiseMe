package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01me {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari(CONTAİNS İF) silen
         bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]

         REMOVE DERSEK ELEMANLARI SİLER VE İNDEXLER KARISIR.
         */

        ArrayList<String> isimler=new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanIsimler=new ArrayList<String>();

        for (String each:isimler) {
            if (!each.toLowerCase().contains("a")){
                aOlmayanIsimler.add(each);
            }
        }
        System.out.println("a harfi olmayan isimler : "+aOlmayanIsimler);
    }
}
