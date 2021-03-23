package easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxConsecutiveOnesTest {
    private MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    @Test
    public void tc1() {
        int result = solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        assertThat(result, is(3));
    }
}