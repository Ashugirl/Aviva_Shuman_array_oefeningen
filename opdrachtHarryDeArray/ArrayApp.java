package be.intecbrussel.opdrachtHarryDeArray;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        // hier wil ik de methode "toString" toepassen, maar hij geeft geen boolean terug.
        int[] numbers = {3, 5, 7, 10, 9};
        boolean isSorted = IntArrayTools.isSorted(numbers);

        System.out.println("The array is sorted: " + isSorted);

        int[] numbers1 = {29, 45, 3, 7, 5};
        int[] sort = IntArrayTools.sort(numbers1);

        System.out.println(Arrays.toString(numbers1));

        int[] numbers3 = {1, 6, 8, 35, 88};
        int number = 29;
        boolean chopSearch = IntArrayTools.chopSearch(numbers3, number);

        System.out.println("The array contains the number " + number + ": "  + chopSearch);

        char[] letters = {'a', 'n', '9', 'T', '$', '?'};
        char[] filterAlphabet = CharArrayTools.filterAlphabet(letters);


        //poging om de methode "filterAlphabet" toe te passen.
        /*char[] letters = {'1', 'a', '?', 'W'};
        System.out.println(letters);
        CharArrayTools.filterAlphabet();*/



    }
}
