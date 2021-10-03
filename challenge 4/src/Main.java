import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 5, 7}, {1, 7, 10}};
        int [] newArr=newArr(arr);
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] newArr(int[][] arr){
        int[] newArr= new int[arr.length];
        int val = 0;
        for (int i=0 ; i<arr.length ; i++){
            for (int j=0; j < arr[1].length ; j++){
                val = val + arr[i][j];
            }
            newArr[i] = val;
            val=0;
        }
        return newArr;
    }
}
