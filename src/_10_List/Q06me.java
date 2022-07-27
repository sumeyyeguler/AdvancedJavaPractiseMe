package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06me {
    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari(CONTAİNS), ilki haric silip(REMOVE), tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *ONCE LİST E CEVİRMELİYİZ CUNKU LENGHTİNİ BİLMİYORUZ. O YUZDEN ARRAYİ BASTA CREATE EDEMEYİZ.
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> tekrarsiz=new ArrayList<>();

        for (int each:arr) {
            if (!tekrarsiz.contains(each)){
                tekrarsiz.add(each);
            }

        }
        Collections.sort(tekrarsiz);
        int tekrarsizArray[]=new int[tekrarsiz.size()];
        for (int i = 0; i <tekrarsizArray.length ; i++) {
            tekrarsizArray[i]=tekrarsiz.get(i);
        }
        System.out.println(Arrays.toString(tekrarsizArray));
    }
}
