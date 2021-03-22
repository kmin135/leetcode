package easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    private TwoSum solution;

    @Before
    public void setUp() throws Exception {
        solution = new TwoSum();
    }

    @Test
    public void tc1() {
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void tc2() {
        assertArrayEquals(new int[]{1,2}, solution.twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    public void tc3() {
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{3,3}, 6));
    }
}