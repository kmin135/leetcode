package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RemoveElementTest {
    @Test
    public void test1() {
        RemoveElement s = new RemoveElement();
        int[] nums = new int[]{3, 2, 2, 3};
        int result = s.removeElement(nums, 3);

        assertThat(result, is(2));

        int[] expected = new int[]{2,2};
        Arrays.sort(expected);
        int[] actual = Arrays.copyOf(nums, 2);
        Arrays.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        RemoveElement s = new RemoveElement();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int result = s.removeElement(nums, 2);

        assertThat(result, is(5));

        int[] expected = new int[]{0,1,3,0,4};
        Arrays.sort(expected);
        int[] actual = Arrays.copyOf(nums, 5);
        Arrays.sort(actual);
        Assert.assertArrayEquals(expected, actual);
    }
}