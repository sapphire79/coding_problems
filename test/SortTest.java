import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void sortArrayTest() {
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>() {{
            add(2);
            add(4);
            add(2);
            add(1);
            add(6);
            add(8);
            add(3);
        }};

        ArrayList<Integer> expectedArray = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(3);
            add(4);
            add(6);
            add(8);
        }};
        assertEquals(expectedArray, Sort.sortArrayList(arrayToSort));
    }
}