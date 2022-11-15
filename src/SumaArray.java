import java.util.Arrays;

public class SumaArray {

    public int[] suma(int[] array1, int[] array2, int[] array3){
        for (int i = 0; i < array3.length; i++) {
            int valArr1 = 0;
            int valArr2 = 0;

            if (array1.length>i){
                valArr1 = array1[i];
            }

            if(array2.length>i){
                valArr2 = array2[i];
            }

            array3[i] = valArr1 + valArr2;
        }
        return array3;
    }
}
