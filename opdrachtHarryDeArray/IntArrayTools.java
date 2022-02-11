package be.intecbrussel.opdrachtHarryDeArray;

public class IntArrayTools {

    public static boolean isSorted(int[] numbers) {
        int i = 0;
        numbers[i] = 0;
        while (numbers.length <=1){
        for (i = 0; i < numbers.length - 1; i++) {
            System.out.println(isSorted(numbers));
            if (numbers[i] <= numbers[i]-1 || numbers[i] >= numbers[i] -1 ) {
                return true;
            } else {
                return false;
            }
        }
    }
        return false;
    }
    // ik heb ook een poging gedaan met de opdracht "sort", maar die is per ongeluk gedelete. Het lukte sowieso niet.
}





