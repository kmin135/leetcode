package easy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ValidMountainArrayTest {
    private ValidMountainArray sol;

    @Before
    public void setUp() {
        sol = new ValidMountainArray();
    }

    @Test
    public void tc1() {
        assertThat(sol.validMountainArray(new int[]{2,1}), is(false));
    }

    @Test
    public void tc2() {
        assertThat(sol.validMountainArray(new int[]{3,5,5}), is(false));
    }

    @Test
    public void tc3() {
        assertThat(sol.validMountainArray(new int[]{0,3,2,1}), is(true));
    }

    @Test
    public void tc4() {
        assertThat(sol.validMountainArray(new int[]{0,1,0,1}), is(false));
    }
}