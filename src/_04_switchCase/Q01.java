package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*



		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		*** switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen notunuzu giriniz");
		int not= scan.nextInt();

		switch (not){
			case 1:
		}

	}
}
