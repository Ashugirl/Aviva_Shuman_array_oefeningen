package be.intecbrussel.opdrachtHarryDeArray;

public class IntArrayTools {

    public static boolean isSorted(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] sort(int[] numbers) {

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }

            }

        }
        return numbers;
    }

    public static boolean chopSearch(int[] numbers, int key){
        for (int i = 0; i < numbers.length; i++){
            if (key == numbers[i]){
                return true;
            }
        }

        return false;
    }
        // WRONG WAY!!!
        /*int i = 0;
        numbers[i] = 0;
        while (numbers.length <= 1) {
            for (i = 0; i < numbers.length - 1; i++) {
                System.out.println(isSorted(numbers));
                if (numbers[i] <= numbers[i] - 1 || numbers[i] >= numbers[i] - 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }*/


    }





