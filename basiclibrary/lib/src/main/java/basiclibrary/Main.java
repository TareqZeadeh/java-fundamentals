package basiclibrary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //---roll method call-------
        String rollsValues = Arrays.toString( Library.roll(4));
//        for (int i=0; i < rollsValues.length; i++){
            System.out.println(rollsValues);
//        }

        //---containsDuplicates method--------
        int[] arr={1,2,3,4,5,6,8,7};
        boolean containsDuplicates =Library.containsDuplicates(arr);
        System.out.println(containsDuplicates);

        //---calculatingAverages method--------
        int[] arr2={1,2,3,4,5,8,7};
        double average = Library.calculatingAverages(arr2);
        System.out.println(average);


        //---lowestAverage method--------
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arr3 = Library.lowestAverage(weeklyMonthTemperatures);
        for (int i=0; i < arr3.length; i++){
            System.out.print(arr3[i] +",");
        }
    }
}
