package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceElementsWithGreatestElementOnRightSideTest {
    private ReplaceElementsWithGreatestElementOnRightSide solution = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void tc1() {
        int[] results = solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1});

        assertArrayEquals(new int[]{18,6,6,6,1,-1}, results);
    }

    @Test
    public void tc2() {
        int[] results = solution.replaceElements(new int[]{400});

        assertArrayEquals(new int[]{-1}, results);
    }
}