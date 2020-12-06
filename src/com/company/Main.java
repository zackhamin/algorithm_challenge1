package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        countingValleys(8, "UDDDUDUU");

        int a[] = {1, 2, 3, 4,5,6,7,8,9,10};
        reverseArray(a);
    }

    //    public static int countingValleys(int steps, String path) {
//        int stepsCount = 0;
//        int valleysClimbed = 0;
//
//        char[] pathArray = path.toCharArray();
//
//        for (int i = 0; i < pathArray.length; i++) {
//            if (pathArray[i] == 'U') {
//                stepsCount += 1;
//                if (stepsCount == 0) {
//                    valleysClimbed += 1;
//                }
//            } else {
//                stepsCount -= 1;
//            }
//        }
//        System.out.println(valleysClimbed);
//        return valleysClimbed;
//    }
    static int[] reverseArray(int[] a) {

        int i = 0;
        int j = a.length - 1;
        int tmp;
        while (j > i) {
            tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;
            j--;
            i++;
        }
        return a;
    }

}
