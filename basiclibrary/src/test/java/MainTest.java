import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}")
    public void lowestAverage() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arrExpected = {55, 54, 60, 53, 59, 57, 61};

        assertArrayEquals(arrExpected, Main.lowestAverage(weeklyMonthTemperatures), "lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}");

    }
    @Test
    @DisplayName("roll should return array of length 6")
    public void roll(){
        assertEquals(6, Main.roll(6).length, "roll should return array of length 6");
    }

    @Test
    @DisplayName("average should return the average of array equal to 5")
    public void calculatingAverages() {
        int[] avgArr = {10, 3, 3, 4};
        assertEquals(5, Main.calculatingAverages(avgArr), "average should return the average of array equal to 5");
    }

    @Test
    @DisplayName("containsDuplicates should return true or false")
    public void containsDuplicates() {
        int[] trueArr = {1, 2, 1, 4};
        int[] falseArr = {1, 2, 3, 4};


        assertTrue(Main.containsDuplicates(trueArr), "containsDuplicates should return 'true'");
        assertFalse(Main.containsDuplicates(falseArr), "containsDuplicates should return 'false'");

    }

}
