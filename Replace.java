package List;

import java.util.Arrays;
import java.util.Scanner;

public class Replace {

    public static int [] replace(int[] arr, int key, int replace){
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == key){
                arr[i] = replace;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = {2,6,8,9,5};

        System.out.println("Enter the number to be searched and replaced");
        int key = sc.nextInt();

        System.out.println("Enter the replacing number");
        int replace = sc.nextInt();

        System.out.println("Array before replacing value\n" + Arrays.toString(arr));
        System.out.println();
        System.out.println("Array after replacing value\n" + Arrays.toString(replace(arr, key, replace)));
    }
}
