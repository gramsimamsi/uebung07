package ueb07;

import java.util.Comparator;

public class Sortieren {

    public static <E> void swap(E[] array, int left, int right){

        E temp;     //initialize buffer variable
        temp = array[left];     //store left T in buffer
        array[left] = array[right]; //overwrite left T with right T
        array[right] = temp;    //overwrite right T with buffered T

        //done!
    }

    /*
    Example sorting, each line is after the next number comparison:
    Start: 5, 2, 3, 6

    5, 2, 3, 6
    5, 2, 3, 6
    2, 5, 3, 6

    2, 3, 5, 6
    2, 3, 5, 6

    2, 3, 5, 6

    End: 2, 3, 5, 6
     */
    public static <E extends Comparable> void bubbleSort(E[] array, int left, int right){

        for (int i = array.length; i > 1; i-- ){
            for (int j = 0; j < i-1; j++ ){
                if (array[ j ].compareTo(array[ j + 1]) > 0){
                    Sortieren.swap(array, j, j + 1);
                } // Ende if
            } // Ende innere for-Schleife
        } // Ende äußere for-Schleife


    }

    public static <E> void bubbleSort(E[] array, int left, int right, Comparator<E> comparator){

        for (int i = array.length; i > 1; i-- ){
            for (int j = 0; j < i-1; j++ ){
                if (comparator.compare(array[j], array[j + 1] ) > 0){
                    Sortieren.swap(array, j, j + 1);
                } // Ende if
            } // Ende innere for-Schleife
        } // Ende äußere for-Schleife


    }
}
