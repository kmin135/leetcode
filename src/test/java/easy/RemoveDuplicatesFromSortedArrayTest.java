package easy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray sol;

    @Before
    public void setup() {
        sol = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void tc1() {
        int[] input = {1,1,2};
        int result = sol.removeDuplicates(input);
        assertThat(result, is(2));
        assertArrayEquals(new int[]{1,2}, Arrays.copyOf(input, 2));
    }

    @Test
    public void tc2() {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int result = sol.removeDuplicates(input);
        assertThat(result, is(5));
        assertArrayEquals(new int[]{0,1,2,3,4}, Arrays.copyOf(input, 5));
    }
}