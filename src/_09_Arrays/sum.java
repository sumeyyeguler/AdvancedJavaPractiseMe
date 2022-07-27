package _09_Arrays;

public class sum {
    public static void main(String[] args) {
        String arr[][] = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};

        dolar(arr);
        System.out.println("dolar : " + (dolar(arr)));
        euro(arr);
        System.out.println("euro : " + (euro(arr)));

    }//main sonu


    private static double dolar(String[][] arr) {
        double dolarToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    dolarToplam += Double.parseDouble(arr[i][j].replace("$", "")) * 3.2;
                }
            }
        }
        return dolarToplam;
    }

    private static double euro(String[][] arr) {
        double euroToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("€")) {
                    euroToplam += Double.parseDouble(arr[i][j].replace("€", "")) * 4.2;
                }

            }
        }
        return euroToplam;
    }
}