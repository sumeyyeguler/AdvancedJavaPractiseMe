package _06_Method_Creation;

public class deneme {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder(2+3+"java"+5);
        System.out.println(str);

        StringBuilder str1=new StringBuilder(2+3+5);
        System.out.println(str1.length());
        System.out.println(str1.capacity());
    }
}
