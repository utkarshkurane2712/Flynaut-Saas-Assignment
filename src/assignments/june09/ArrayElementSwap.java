package assignments.june09;

import java.util.Arrays;

public class ArrayElementSwap {

    public static void main(String[] args) {

        int[] orignal = {10,20,30,40,50};

        int[] swapped = Arrays.copyOf(orignal,orignal.length);

        int temp = swapped[0];
        swapped[0] = swapped[swapped.length - 1];
        swapped[swapped.length - 1] = temp;

        System.out.println("Orignal Array"+Arrays.toString(orignal) );
        System.out.println("After Swappend Element"+Arrays.toString(swapped));
    }
}
