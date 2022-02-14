package be.intecbrussel.opdrachtHarryDeArray;

public class CharArrayTools {

    public static char[] filterAlphabet(char[] alpha) {

        for (int i = 0; i < alpha.length; i++) {
            for (int k = 0; k < alpha.length; k++) {
                char empty = ' ';
                char onlyAlph;
                int j = alpha.length;


                if ((alpha[i] >= 'A' && alpha[i] <= 'Z') || (alpha[i] >= 'a' && alpha[i] <= 'z')) {
                    onlyAlph = alpha[i];
                } else {
                    if ((alpha[k] < 'A' && alpha[k] > 'Z') || (alpha[k] < 'a' && alpha[k] > 'z')) {


                    }
                }

                char[] alphaArray = new char[j - k];
                System.out.println(alphaArray);
            }


        }

            return alpha;}


    }

