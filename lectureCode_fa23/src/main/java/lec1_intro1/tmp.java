package lec1_intro1;

// import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tmp {

    public static void select_sort(String[] input_array) {
        int array_len = input_array.length;
        // String[] new_array = new String[array_len];

        for (int i=0; i<array_len; i++) {
            for (int k=i+1; k<array_len; k++) {
                if (input_array[k].compareTo(input_array[i]) < 0 ){
                    String tmp_item = input_array[i];
                    input_array[i] = input_array[k];
                    input_array[k] = tmp_item;

                }
            }
        }
        

    }

    public static void main(String[] args) {
        // String a = "x";
        // String b = "a";
        String[] a = new String[4];
        a[0] = "b";
        a[1] = "a";
        a[2] = "g";
        a[3] = "d";
        select_sort(a);
        System.out.println(Arrays.toString(a));
    }
}
