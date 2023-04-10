import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;


        input = new ArrayList<>(Arrays.asList("hello", "to", "farewell", "goodbye", "hi"));
        expectedOutput = new ArrayList<>(Arrays.asList("farewell", "goodbye", "hello", "hi", "to"));
        StringListSort.selectionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);


        input = new ArrayList<>(Arrays.asList("hello", "to", "farewell", "goodbye", "hi", "a", "and", "there"));
        expectedOutput = new ArrayList<>(Arrays.asList("a", "and", "farewell", "goodbye", "hello", "hi", "there", "to"));
        StringListSort.selectionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testInsertionSort() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;


        input = new ArrayList<>(Arrays.asList("hello", "to", "farewell", "goodbye", "hi"));
        expectedOutput = new ArrayList<>(Arrays.asList("farewell", "goodbye", "hello", "hi", "to"));
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);


        input = new ArrayList<>(Arrays.asList("to", "hi", "farewell", "goodbye", "hello"));
        expectedOutput = new ArrayList<>(Arrays.asList("farewell", "goodbye", "hello", "hi", "to"));
        StringListSort.insertionSort(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }
}
