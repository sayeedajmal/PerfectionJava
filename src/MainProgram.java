import java.util.Arrays;

import data.Array;

public class MainProgram {
    public static void main(String[] args) {
        int[] List={2,4,5,6};
        int newItem=10;
       int[] test=Array.InsertAtLast(List, newItem);
       System.out.println(Arrays.toString(test));
    }
}
