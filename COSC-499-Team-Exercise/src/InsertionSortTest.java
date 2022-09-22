import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsertionSortTest                                                                                  // class for testing Insertion sort method
{
        @Test
        void test1()                                                                                            // perform 1 JUnit test
        {
                int[] array = {62,48,10,25,19};                                                                 // initialize an integer array
                assertArrayEquals(new int[] {10,19,25,48,62}, InsertionSort.insertionSort(array));
        }
}

/* test1 has passed */