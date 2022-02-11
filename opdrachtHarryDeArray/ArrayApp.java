package be.intecbrussel.opdrachtHarryDeArray;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {
        // hier wil ik de methode "toString" toepassen, maar hij geeft geen boolean terug.
        int[] numbers = {4,5,6,7};
        IntArrayTools.isSorted(numbers);

        System.out.println(Arrays.toString(numbers));


        //poging om de methode "filterAlphabet" toe te passen.
        char[] letters = {'1', 'a', '?', 'W'};
        System.out.println(letters);
        CharArrayTools.filterAlphabet();



    }
}
