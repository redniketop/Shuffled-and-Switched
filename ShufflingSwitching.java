package MyIdea;

import java.util.Arrays;

public class ShufflingSwitching {
    public static void main(String[] args) {

        //Single Dimension Array
        int[] num1 = {12, 20, 24, 33, 57, 25};
        int[] num2 = {16, 31, 46, 58, 63, 11};

        //For loop to iterate and to shuffle and switch numbers between the two Arrays.

        for(int i = num1.length - 1; i > 0; i--){
            int j = (int)(Math.random() * (i + 1));{
        }
        // Swaping in order to switch numbers around.
            int swap = num1[i];
            num1[i] = num2[j];
            num2[j] = swap;
        }
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));


     
    }
}
