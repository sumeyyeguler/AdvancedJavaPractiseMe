package _09_Arrays;

public class SumeyyeG {
    /*
        String 2D array oluştur
       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
       String de $ varsa 3.2 ile çarp
       String de € varsa 4.2 ile çarp
       double return et
    */
    public static void main(String[] args) {

        String arr[][] = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        toplamlariniBul(arr);
        System.out.println(toplamlariniBul(arr));


    }//main sonu

    private static double toplamlariniBul(String[][] arr) {
        double dolarToplam = 0;
        double euroToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    dolarToplam += Double.parseDouble(arr[i][j].replace("$", "")) * 3.2;
                } else if (arr[i][j].contains("€")) {
                    euroToplam += Double.parseDouble(arr[i][j].replace("€", "")) * 4.2;

                }
            }

        }

        return euroToplam + dolarToplam;

    }
}

