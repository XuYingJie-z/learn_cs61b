/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lec6_testing;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    // public static void main(String[] args) {
    //     System.out.println(new App().getGreeting());
    //     System.out.println( "z".compareTo( "bc"));
    // }



    public static String[] sort(String[] input_array) {

        String[] x = new String[input_array.length];
        String biggest_str = find_biggest(input_array);
        
        for (int i=0; i<x.length; i++ ) {
            String small_string = find_small(input_array);
            x[i] = small_string;
            for (int h=0; h<input_array.length; h++ ) {
                if (input_array[h] == small_string) {
                    input_array[h] =  biggest_str;
                }
            }
        }

        return x;
        

    }
    public static String find_small(String[] input_array) {

        String smallest = input_array[0];
        for (String i : input_array){
            if (smallest.compareTo(i) > 0) {
                smallest = i;
            }

        }
        return smallest;
    }

    public static String find_biggest(String[] input_array) {
        String biggest = input_array[0];
        for (String i : input_array) {
            if (i.compareTo(biggest) > 0) {
                biggest = i;
            }
        }

        return biggest;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new String[]{"g", "c", "b", "a"}))) ;
    }
}
