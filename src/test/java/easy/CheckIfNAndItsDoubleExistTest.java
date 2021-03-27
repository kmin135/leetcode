package easy;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CheckIfNAndItsDoubleExistTest {
    private CheckIfNAndItsDoubleExist sol;
    @Before
    public void init() {
        sol = new CheckIfNAndItsDoubleExist();
    }

    @Test
    public void tc1() {
        assertThat(sol.checkIfExist(new int[]{10,2,5,3}), is(true));
        assertThat(sol.checkIfExist2(new int[]{10,2,5,3}), is(true));
    }

    @Test
    public void tc2() {
        assertThat(sol.checkIfExist(new int[]{7,1,14,11}), is(true));
        assertThat(sol.checkIfExist2(new int[]{7,1,14,11}), is(true));
    }

    @Test
    public void tc3() {
        assertThat(sol.checkIfExist(new int[]{3,1,7,11}), is(false));
        assertThat(sol.checkIfExist2(new int[]{3,1,7,11}), is(false));
    }

    @Test
    public void tc4() {
        assertThat(sol.checkIfExist(new int[]{-10,12,-20,-8,15}), is(true));
        assertThat(sol.checkIfExist2(new int[]{-10,12,-20,-8,15}), is(true));
    }

    @Test
    public void tc5() {
        assertThat(sol.checkIfExist(new int[]{0,0}), is(true));
        assertThat(sol.checkIfExist2(new int[]{0,0}), is(true));
    }
}