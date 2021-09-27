import java.util.*;
public class Main {
    public static void main(String[] args) {
        //---roll method call-------
        int[] rollsValues = roll(4);
        for (int i=0; i < rollsValues.length; i++){
            System.out.print(rollsValues[i] +",");
        }
        //---containsDuplicates method--------
        int[] arr={1,2,3,4,5,6,8,7};
        boolean containsDuplicates =containsDuplicates(arr);
        System.out.println(containsDuplicates);

        //---calculatingAverages method--------
        int[] arr2={1,2,3,4,5,8,7};
        double average = calculatingAverages(arr2);
        System.out.println(average);


        //---lowestAverage method--------
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arr3 = lowestAverage(weeklyMonthTemperatures);
        for (int i=0; i < arr3.length; i++){
            System.out.print(arr3[i] +",");
        }
    }
//-----------------roll method------------------------------
    public static int[] roll(int n){
        int[] rollsValues = new int[n];
        Random randomNum = new Random();
        for (int i=0; i < rollsValues.length; i++){
            rollsValues[i]=randomNum.nextInt(6)+1;
        }

        return rollsValues;
    }


    //-----------------containsDuplicates method------------------------------
    public  static  boolean containsDuplicates (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j< arr.length; j++) {
                if (arr[i]== arr[j]){
                    return true;
                }
            }
        }
        return false;

    }

    //-----------------calculatingAverages mathod------------------------------

    public static double calculatingAverages(int[] arr){
        double arrayValuesSummation = 0.0;
        double average = 0.0;
        for (int number : arr){
            arrayValuesSummation = arrayValuesSummation + number;

        }
        average = arrayValuesSummation / arr.length;
        return average;
    }


    //-----------------lowestAverage method------------------------------

    public static int[] lowestAverage(int[][] arr){
        double summation=0.0;
        double lowestAvg=0.0;
        double avg=0.0;
        int[] lowestAvgArray=null;
        for(int[] itemArr : arr ){
            summation=0.0;
            avg=0.0;
            for(int item : itemArr ){
                summation = summation + item;

            }
            avg = summation/itemArr.length;
            if (lowestAvg==0.0){
                lowestAvg=avg;

            }else if (avg <lowestAvg){
                lowestAvgArray= itemArr ;

                lowestAvg =avg;

            }
        }
            return lowestAvgArray;
    }
}
