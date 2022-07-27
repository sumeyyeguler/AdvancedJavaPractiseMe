package _06_Method_Creation;

public class cozumm {
    public static void main(String[] args) {
       		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/


        String name1="mehmet";
        String name2="hilal";

        birlesikKelime(name1,name2);

    }

    private static void birlesikKelime(String name1, String name2) {

        if (name1.length()%2==0){
            int mid=name1.length()/2;
            String kelime=name1.substring(0,mid).concat(name2).concat(name1.substring(mid));
            System.out.println(kelime);
        }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

    }
}
