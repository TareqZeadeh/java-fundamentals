package basiclibrary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //---roll method call-------
        String rollsValues = Arrays.toString( Library.roll(4));
//        for (int i=0; i < rollsValues.length; i++){
        System.out.println(rollsValues);
//        }

        //---containsDuplicates method call--------
        int[] arr={1,2,3,4,5,6,8,7};
        boolean containsDuplicates =Library.containsDuplicates(arr);
        System.out.println(containsDuplicates);

        //---calculatingAverages method call--------
        int[] arr2={1,2,3,4,5,8,7};
        double average = Library.calculatingAverages(arr2);
        System.out.println(average);


        //---lowestAverage method call--------
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arr3 = Library.lowestAverage(weeklyMonthTemperatures);

        System.out.println(Arrays.toString(arr3));

        //---minMaxTemp method call--------
        String temperature=Library.minMaxTemp(weeklyMonthTemperatures);
        System.out.println(temperature);
        //---tally method call--------
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = Library.tally(votes);
        System.out.println(winner + " received the most votes!");

    }
}
